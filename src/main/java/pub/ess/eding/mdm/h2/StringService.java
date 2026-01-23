package pub.ess.eding.mdm.h2;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.helidon.examples.webserver.grpc.Strings.StringMessage;
import io.helidon.grpc.core.CollectingObserver;
import io.helidon.webserver.grpc.GrpcService;

import com.google.protobuf.Descriptors;
import io.grpc.stub.StreamObserver;

import static io.helidon.grpc.core.ResponseHelper.complete;
import static io.helidon.grpc.core.ResponseHelper.stream;

class StringService implements GrpcService {

    @Override
    public Descriptors.FileDescriptor proto() {
        return Strings.getDescriptor();
    }

    @Override
    public void update(Routing router) {
        router.unary("Upper", this::upper)
                .unary("Lower", this::lower)
                .serverStream("Split", this::split)
                .clientStream("Join", this::join)
                .bidi("Echo", this::echo);
    }

    private void upper(StringMessage request, StreamObserver<StringMessage> observer) {
        String requestText = request.getText();
        complete(observer, StringMessage.newBuilder()
                .setText(requestText.toUpperCase(Locale.ROOT))
                .build());
    }

    private void lower(StringMessage request, StreamObserver<StringMessage> observer) {
        String requestText = request.getText();
        complete(observer, StringMessage.newBuilder()
                .setText(requestText.toLowerCase(Locale.ROOT))
                .build());
    }

    private void split(StringMessage request, StreamObserver<StringMessage> observer) {
        String[] parts = request.getText().split(" ");
        stream(observer, Stream.of(parts).map(this::newStringMessage));
    }

    private StreamObserver<StringMessage> join(StreamObserver<StringMessage> observer) {
        return CollectingObserver.create(
                Collectors.joining(" "),
                observer,
                StringMessage::getText,
                this::newStringMessage);
    }

    private StreamObserver<Strings.StringMessage> echo(StreamObserver<Strings.StringMessage> observer) {
        return new StreamObserver<>() {
            @Override
            public void onNext(Strings.StringMessage value) {
                observer.onNext(value);
            }

            @Override
            public void onError(Throwable t) {
                observer.onError(t);
            }

            @Override
            public void onCompleted() {
                observer.onCompleted();
            }
        };
    }

    private StringMessage newStringMessage(String text) {
        return StringMessage.newBuilder().setText(text).build();
    }
}
