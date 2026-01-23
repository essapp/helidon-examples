package pub.ess.eding.mdm.h2;

import javax.annotation.Nullable;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

/**
 * Intercepts a client call and wraps outgoing messages in double square brackets.
 */
class StringServiceInterceptor implements ClientInterceptor {

    @Override
    public <ReqT, ResT> ClientCall<ReqT, ResT> interceptCall(MethodDescriptor<ReqT, ResT> method,
                                                             CallOptions callOptions,
                                                             Channel next) {
        ClientCall<ReqT, ResT> delegate = next.newCall(method, callOptions);
        return new ClientCall<>() {
            @Override
            public void start(Listener<ResT> responseListener, Metadata headers) {
                delegate.start(responseListener, headers);
            }

            @Override
            public void request(int numMessages) {
                delegate.request(numMessages);
            }

            @Override
            public void cancel(@Nullable String message, @Nullable Throwable cause) {
                delegate.cancel(message, cause);
            }

            @Override
            public void halfClose() {
                delegate.halfClose();
            }

            @Override
            @SuppressWarnings("unchecked")
            public void sendMessage(ReqT message) {
                Strings.StringMessage msg = (Strings.StringMessage) message;
                delegate.sendMessage((ReqT) Strings.StringMessage.newBuilder()
                        .setText("[[" + msg.getText() + "]]")
                        .build());
            }
        };
    }
}