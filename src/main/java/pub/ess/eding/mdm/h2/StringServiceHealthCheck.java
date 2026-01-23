package pub.ess.eding.mdm.h2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import io.helidon.common.configurable.Resource;
import io.helidon.common.tls.Tls;
import io.helidon.config.Config;
import io.helidon.health.HealthCheck;
import io.helidon.health.HealthCheckResponse;
import io.helidon.health.HealthCheckType;
import io.helidon.scheduling.Scheduling;
import io.helidon.webclient.api.WebClient;
import io.helidon.webclient.grpc.GrpcClient;

class StringServiceHealthCheck implements HealthCheck {

    private final WebClient webClient;
    private CountDownLatch latch;
    private volatile boolean readiness = true;

    StringServiceHealthCheck(Config config) {
        // set up client to access gRPC service
        Tls clientTls = Tls.builder()
                .trust(trust -> trust
                        .keystore(store -> store
                                .passphrase("password")
                                .trustStore(true)
                                .keystore(Resource.create("client.p12"))))
                .build();
        int serverPort = config.get("port").asInt().get();
        this.webClient = WebClient.builder()
                .tls(clientTls)
                .baseUri("https://localhost:" + serverPort)
                .build();
    }

    @Override
    public String name() {
        return StringService.class.getSimpleName();
    }

    @Override
    public HealthCheckType type() {
        return HealthCheckType.READINESS;
    }

    @Override
    public HealthCheckResponse call() {
        if (latch == null) {
            latch = new CountDownLatch(1);
            Scheduling.fixedRate()          // task to check for readiness
                    .delay(1)
                    .initialDelay(0)
                    .timeUnit(TimeUnit.MINUTES)
                    .task(i -> checkReadiness())
                    .build();
        }
        try {
            boolean check = latch.await(5, TimeUnit.SECONDS);
            return HealthCheckResponse.builder()
                    .status(check && readiness)
                    .get();
        } catch (Exception e) {
            return HealthCheckResponse.builder()
                    .status(false)
                    .get();
        }
    }

    /**
     * Self-invocation to verify gRPC endpoint is available and ready.
     */
    private void checkReadiness() {
        try {
            GrpcClient grpcClient = webClient.client(GrpcClient.PROTOCOL);
            StringServiceGrpc.StringServiceBlockingStub service =
                    StringServiceGrpc.newBlockingStub(grpcClient.channel());
            Strings.StringMessage res = service.upper(
                    Strings.StringMessage.newBuilder().setText("hello").build());
            readiness = res.getText().equals("HELLO");
        } catch (Exception e) {
            readiness = false;
        } finally {
            latch.countDown();
        }
    }
}
