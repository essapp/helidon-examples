package pub.ess.eding.mdm.h2;

import io.helidon.config.Config;
import io.helidon.logging.common.LogConfig;
import io.helidon.service.registry.Services;
import io.helidon.webserver.WebServer;
import io.helidon.webserver.grpc.GrpcRouting;
import io.helidon.webserver.observe.ObserveFeature;
import io.helidon.webserver.observe.health.HealthObserver;

class GrpcMain {

    private GrpcMain() {
    }

    /**
     * Main method.
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        LogConfig.configureRuntime();

        // initialize global config from default configuration
        Config config = Services.get(Config.class);
        Config serverConfig = config.get("server");

        // create a health check to verify gRPC endpoint
        ObserveFeature observe = ObserveFeature.builder()
                .addObserver(HealthObserver.builder()
                                     .config(serverConfig.get("features.observe.observers.health"))
                                     .addCheck(new StringServiceHealthCheck(serverConfig))
                                     .build())
                .build();

        // start server and register gRPC routing and health check
        WebServer.builder()
                .config(serverConfig)
                .addRouting(GrpcRouting.builder().service(new StringService()))
                .addFeature(observe)
                .build()
                .start();
    }
}
