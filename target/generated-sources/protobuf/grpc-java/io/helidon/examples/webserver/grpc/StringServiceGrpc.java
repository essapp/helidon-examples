package io.helidon.examples.webserver.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: strings.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StringServiceGrpc {

  private StringServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "StringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getUpperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upper",
      requestType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      responseType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getUpperMethod() {
    io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage> getUpperMethod;
    if ((getUpperMethod = StringServiceGrpc.getUpperMethod) == null) {
      synchronized (StringServiceGrpc.class) {
        if ((getUpperMethod = StringServiceGrpc.getUpperMethod) == null) {
          StringServiceGrpc.getUpperMethod = getUpperMethod =
              io.grpc.MethodDescriptor.<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setSchemaDescriptor(new StringServiceMethodDescriptorSupplier("Upper"))
              .build();
        }
      }
    }
    return getUpperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getLowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lower",
      requestType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      responseType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getLowerMethod() {
    io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage> getLowerMethod;
    if ((getLowerMethod = StringServiceGrpc.getLowerMethod) == null) {
      synchronized (StringServiceGrpc.class) {
        if ((getLowerMethod = StringServiceGrpc.getLowerMethod) == null) {
          StringServiceGrpc.getLowerMethod = getLowerMethod =
              io.grpc.MethodDescriptor.<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lower"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setSchemaDescriptor(new StringServiceMethodDescriptorSupplier("Lower"))
              .build();
        }
      }
    }
    return getLowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Split",
      requestType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      responseType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getSplitMethod() {
    io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage> getSplitMethod;
    if ((getSplitMethod = StringServiceGrpc.getSplitMethod) == null) {
      synchronized (StringServiceGrpc.class) {
        if ((getSplitMethod = StringServiceGrpc.getSplitMethod) == null) {
          StringServiceGrpc.getSplitMethod = getSplitMethod =
              io.grpc.MethodDescriptor.<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Split"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setSchemaDescriptor(new StringServiceMethodDescriptorSupplier("Split"))
              .build();
        }
      }
    }
    return getSplitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Join",
      requestType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      responseType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getJoinMethod() {
    io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage> getJoinMethod;
    if ((getJoinMethod = StringServiceGrpc.getJoinMethod) == null) {
      synchronized (StringServiceGrpc.class) {
        if ((getJoinMethod = StringServiceGrpc.getJoinMethod) == null) {
          StringServiceGrpc.getJoinMethod = getJoinMethod =
              io.grpc.MethodDescriptor.<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Join"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setSchemaDescriptor(new StringServiceMethodDescriptorSupplier("Join"))
              .build();
        }
      }
    }
    return getJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      responseType = io.helidon.examples.webserver.grpc.Strings.StringMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage,
      io.helidon.examples.webserver.grpc.Strings.StringMessage> getEchoMethod() {
    io.grpc.MethodDescriptor<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage> getEchoMethod;
    if ((getEchoMethod = StringServiceGrpc.getEchoMethod) == null) {
      synchronized (StringServiceGrpc.class) {
        if ((getEchoMethod = StringServiceGrpc.getEchoMethod) == null) {
          StringServiceGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.helidon.examples.webserver.grpc.Strings.StringMessage.getDefaultInstance()))
              .setSchemaDescriptor(new StringServiceMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StringServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StringServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StringServiceStub>() {
        @java.lang.Override
        public StringServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StringServiceStub(channel, callOptions);
        }
      };
    return StringServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StringServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StringServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StringServiceBlockingV2Stub>() {
        @java.lang.Override
        public StringServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StringServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StringServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StringServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StringServiceBlockingStub>() {
        @java.lang.Override
        public StringServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StringServiceBlockingStub(channel, callOptions);
        }
      };
    return StringServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StringServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StringServiceFutureStub>() {
        @java.lang.Override
        public StringServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StringServiceFutureStub(channel, callOptions);
        }
      };
    return StringServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void upper(io.helidon.examples.webserver.grpc.Strings.StringMessage request,
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpperMethod(), responseObserver);
    }

    /**
     */
    default void lower(io.helidon.examples.webserver.grpc.Strings.StringMessage request,
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLowerMethod(), responseObserver);
    }

    /**
     */
    default void split(io.helidon.examples.webserver.grpc.Strings.StringMessage request,
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSplitMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> join(
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getJoinMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> echo(
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEchoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StringService.
   */
  public static abstract class StringServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StringServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StringService.
   */
  public static final class StringServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StringServiceStub> {
    private StringServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StringServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StringServiceStub(channel, callOptions);
    }

    /**
     */
    public void upper(io.helidon.examples.webserver.grpc.Strings.StringMessage request,
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lower(io.helidon.examples.webserver.grpc.Strings.StringMessage request,
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void split(io.helidon.examples.webserver.grpc.Strings.StringMessage request,
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSplitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> join(
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> echo(
        io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StringService.
   */
  public static final class StringServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StringServiceBlockingV2Stub> {
    private StringServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StringServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StringServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public io.helidon.examples.webserver.grpc.Strings.StringMessage upper(io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpperMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.helidon.examples.webserver.grpc.Strings.StringMessage lower(io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLowerMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, io.helidon.examples.webserver.grpc.Strings.StringMessage>
        split(io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getSplitMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage>
        join() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getJoinMethod(), getCallOptions());
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<io.helidon.examples.webserver.grpc.Strings.StringMessage, io.helidon.examples.webserver.grpc.Strings.StringMessage>
        echo() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getEchoMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StringService.
   */
  public static final class StringServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StringServiceBlockingStub> {
    private StringServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StringServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.helidon.examples.webserver.grpc.Strings.StringMessage upper(io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpperMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.helidon.examples.webserver.grpc.Strings.StringMessage lower(io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLowerMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<io.helidon.examples.webserver.grpc.Strings.StringMessage> split(
        io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSplitMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StringService.
   */
  public static final class StringServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StringServiceFutureStub> {
    private StringServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StringServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StringServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.helidon.examples.webserver.grpc.Strings.StringMessage> upper(
        io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpperMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.helidon.examples.webserver.grpc.Strings.StringMessage> lower(
        io.helidon.examples.webserver.grpc.Strings.StringMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLowerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPPER = 0;
  private static final int METHODID_LOWER = 1;
  private static final int METHODID_SPLIT = 2;
  private static final int METHODID_JOIN = 3;
  private static final int METHODID_ECHO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPPER:
          serviceImpl.upper((io.helidon.examples.webserver.grpc.Strings.StringMessage) request,
              (io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage>) responseObserver);
          break;
        case METHODID_LOWER:
          serviceImpl.lower((io.helidon.examples.webserver.grpc.Strings.StringMessage) request,
              (io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage>) responseObserver);
          break;
        case METHODID_SPLIT:
          serviceImpl.split((io.helidon.examples.webserver.grpc.Strings.StringMessage) request,
              (io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOIN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.join(
              (io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage>) responseObserver);
        case METHODID_ECHO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.echo(
              (io.grpc.stub.StreamObserver<io.helidon.examples.webserver.grpc.Strings.StringMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUpperMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.helidon.examples.webserver.grpc.Strings.StringMessage,
              io.helidon.examples.webserver.grpc.Strings.StringMessage>(
                service, METHODID_UPPER)))
        .addMethod(
          getLowerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.helidon.examples.webserver.grpc.Strings.StringMessage,
              io.helidon.examples.webserver.grpc.Strings.StringMessage>(
                service, METHODID_LOWER)))
        .addMethod(
          getSplitMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.helidon.examples.webserver.grpc.Strings.StringMessage,
              io.helidon.examples.webserver.grpc.Strings.StringMessage>(
                service, METHODID_SPLIT)))
        .addMethod(
          getJoinMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              io.helidon.examples.webserver.grpc.Strings.StringMessage,
              io.helidon.examples.webserver.grpc.Strings.StringMessage>(
                service, METHODID_JOIN)))
        .addMethod(
          getEchoMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              io.helidon.examples.webserver.grpc.Strings.StringMessage,
              io.helidon.examples.webserver.grpc.Strings.StringMessage>(
                service, METHODID_ECHO)))
        .build();
  }

  private static abstract class StringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.helidon.examples.webserver.grpc.Strings.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StringService");
    }
  }

  private static final class StringServiceFileDescriptorSupplier
      extends StringServiceBaseDescriptorSupplier {
    StringServiceFileDescriptorSupplier() {}
  }

  private static final class StringServiceMethodDescriptorSupplier
      extends StringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StringServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StringServiceFileDescriptorSupplier())
              .addMethod(getUpperMethod())
              .addMethod(getLowerMethod())
              .addMethod(getSplitMethod())
              .addMethod(getJoinMethod())
              .addMethod(getEchoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
