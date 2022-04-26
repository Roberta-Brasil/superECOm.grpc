package ds.Service3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service3.proto")
public final class service3Grpc {

  private service3Grpc() {}

  public static final String SERVICE_NAME = "service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.Service3.enterCity,
      ds.Service3.displayLocationDetails> getEnterLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enterLocation",
      requestType = ds.Service3.enterCity.class,
      responseType = ds.Service3.displayLocationDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service3.enterCity,
      ds.Service3.displayLocationDetails> getEnterLocationMethod() {
    io.grpc.MethodDescriptor<ds.Service3.enterCity, ds.Service3.displayLocationDetails> getEnterLocationMethod;
    if ((getEnterLocationMethod = service3Grpc.getEnterLocationMethod) == null) {
      synchronized (service3Grpc.class) {
        if ((getEnterLocationMethod = service3Grpc.getEnterLocationMethod) == null) {
          service3Grpc.getEnterLocationMethod = getEnterLocationMethod = 
              io.grpc.MethodDescriptor.<ds.Service3.enterCity, ds.Service3.displayLocationDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3", "enterLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service3.enterCity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service3.displayLocationDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new service3MethodDescriptorSupplier("enterLocation"))
                  .build();
          }
        }
     }
     return getEnterLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.Service3.addInfo,
      ds.Service3.responseAddInfo> getAddingDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addingDetails",
      requestType = ds.Service3.addInfo.class,
      responseType = ds.Service3.responseAddInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service3.addInfo,
      ds.Service3.responseAddInfo> getAddingDetailsMethod() {
    io.grpc.MethodDescriptor<ds.Service3.addInfo, ds.Service3.responseAddInfo> getAddingDetailsMethod;
    if ((getAddingDetailsMethod = service3Grpc.getAddingDetailsMethod) == null) {
      synchronized (service3Grpc.class) {
        if ((getAddingDetailsMethod = service3Grpc.getAddingDetailsMethod) == null) {
          service3Grpc.getAddingDetailsMethod = getAddingDetailsMethod = 
              io.grpc.MethodDescriptor.<ds.Service3.addInfo, ds.Service3.responseAddInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3", "addingDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service3.addInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service3.responseAddInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new service3MethodDescriptorSupplier("addingDetails"))
                  .build();
          }
        }
     }
     return getAddingDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.Service3.selectViewInfo,
      ds.Service3.responseDataRecorded> getDisplayRecordedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayRecorded",
      requestType = ds.Service3.selectViewInfo.class,
      responseType = ds.Service3.responseDataRecorded.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service3.selectViewInfo,
      ds.Service3.responseDataRecorded> getDisplayRecordedMethod() {
    io.grpc.MethodDescriptor<ds.Service3.selectViewInfo, ds.Service3.responseDataRecorded> getDisplayRecordedMethod;
    if ((getDisplayRecordedMethod = service3Grpc.getDisplayRecordedMethod) == null) {
      synchronized (service3Grpc.class) {
        if ((getDisplayRecordedMethod = service3Grpc.getDisplayRecordedMethod) == null) {
          service3Grpc.getDisplayRecordedMethod = getDisplayRecordedMethod = 
              io.grpc.MethodDescriptor.<ds.Service3.selectViewInfo, ds.Service3.responseDataRecorded>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3", "displayRecorded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service3.selectViewInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service3.responseDataRecorded.getDefaultInstance()))
                  .setSchemaDescriptor(new service3MethodDescriptorSupplier("displayRecorded"))
                  .build();
          }
        }
     }
     return getDisplayRecordedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static service3Stub newStub(io.grpc.Channel channel) {
    return new service3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static service3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new service3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static service3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new service3FutureStub(channel);
  }

  /**
   */
  public static abstract class service3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void enterLocation(ds.Service3.enterCity request,
        io.grpc.stub.StreamObserver<ds.Service3.displayLocationDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterLocationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service3.addInfo> addingDetails(
        io.grpc.stub.StreamObserver<ds.Service3.responseAddInfo> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddingDetailsMethod(), responseObserver);
    }

    /**
     */
    public void displayRecorded(ds.Service3.selectViewInfo request,
        io.grpc.stub.StreamObserver<ds.Service3.responseDataRecorded> responseObserver) {
      asyncUnimplementedUnaryCall(getDisplayRecordedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterLocationMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.Service3.enterCity,
                ds.Service3.displayLocationDetails>(
                  this, METHODID_ENTER_LOCATION)))
          .addMethod(
            getAddingDetailsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.Service3.addInfo,
                ds.Service3.responseAddInfo>(
                  this, METHODID_ADDING_DETAILS)))
          .addMethod(
            getDisplayRecordedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.Service3.selectViewInfo,
                ds.Service3.responseDataRecorded>(
                  this, METHODID_DISPLAY_RECORDED)))
          .build();
    }
  }

  /**
   */
  public static final class service3Stub extends io.grpc.stub.AbstractStub<service3Stub> {
    private service3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private service3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service3Stub(channel, callOptions);
    }

    /**
     */
    public void enterLocation(ds.Service3.enterCity request,
        io.grpc.stub.StreamObserver<ds.Service3.displayLocationDetails> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEnterLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service3.addInfo> addingDetails(
        io.grpc.stub.StreamObserver<ds.Service3.responseAddInfo> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAddingDetailsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void displayRecorded(ds.Service3.selectViewInfo request,
        io.grpc.stub.StreamObserver<ds.Service3.responseDataRecorded> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDisplayRecordedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class service3BlockingStub extends io.grpc.stub.AbstractStub<service3BlockingStub> {
    private service3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service3BlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.Service3.displayLocationDetails> enterLocation(
        ds.Service3.enterCity request) {
      return blockingServerStreamingCall(
          getChannel(), getEnterLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.Service3.responseDataRecorded> displayRecorded(
        ds.Service3.selectViewInfo request) {
      return blockingServerStreamingCall(
          getChannel(), getDisplayRecordedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class service3FutureStub extends io.grpc.stub.AbstractStub<service3FutureStub> {
    private service3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service3FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ENTER_LOCATION = 0;
  private static final int METHODID_DISPLAY_RECORDED = 1;
  private static final int METHODID_ADDING_DETAILS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final service3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(service3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER_LOCATION:
          serviceImpl.enterLocation((ds.Service3.enterCity) request,
              (io.grpc.stub.StreamObserver<ds.Service3.displayLocationDetails>) responseObserver);
          break;
        case METHODID_DISPLAY_RECORDED:
          serviceImpl.displayRecorded((ds.Service3.selectViewInfo) request,
              (io.grpc.stub.StreamObserver<ds.Service3.responseDataRecorded>) responseObserver);
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
        case METHODID_ADDING_DETAILS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addingDetails(
              (io.grpc.stub.StreamObserver<ds.Service3.responseAddInfo>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    service3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.Service3.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("service3");
    }
  }

  private static final class service3FileDescriptorSupplier
      extends service3BaseDescriptorSupplier {
    service3FileDescriptorSupplier() {}
  }

  private static final class service3MethodDescriptorSupplier
      extends service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    service3MethodDescriptorSupplier(String methodName) {
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
      synchronized (service3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new service3FileDescriptorSupplier())
              .addMethod(getEnterLocationMethod())
              .addMethod(getAddingDetailsMethod())
              .addMethod(getDisplayRecordedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
