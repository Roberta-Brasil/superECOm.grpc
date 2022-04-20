package ds.UserCollaboration;

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
    comments = "Source: userCollaboration.proto")
public final class userCollaborationGrpc {

  private userCollaborationGrpc() {}

  public static final String SERVICE_NAME = "userCollaboration";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.UserCollaboration.enterCity,
      ds.UserCollaboration.displayLocationDetails> getEnterLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enterLocation",
      requestType = ds.UserCollaboration.enterCity.class,
      responseType = ds.UserCollaboration.displayLocationDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.UserCollaboration.enterCity,
      ds.UserCollaboration.displayLocationDetails> getEnterLocationMethod() {
    io.grpc.MethodDescriptor<ds.UserCollaboration.enterCity, ds.UserCollaboration.displayLocationDetails> getEnterLocationMethod;
    if ((getEnterLocationMethod = userCollaborationGrpc.getEnterLocationMethod) == null) {
      synchronized (userCollaborationGrpc.class) {
        if ((getEnterLocationMethod = userCollaborationGrpc.getEnterLocationMethod) == null) {
          userCollaborationGrpc.getEnterLocationMethod = getEnterLocationMethod = 
              io.grpc.MethodDescriptor.<ds.UserCollaboration.enterCity, ds.UserCollaboration.displayLocationDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "userCollaboration", "enterLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.UserCollaboration.enterCity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.UserCollaboration.displayLocationDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new userCollaborationMethodDescriptorSupplier("enterLocation"))
                  .build();
          }
        }
     }
     return getEnterLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.UserCollaboration.addInfo,
      ds.UserCollaboration.responseAddInfo> getAddingDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addingDetails",
      requestType = ds.UserCollaboration.addInfo.class,
      responseType = ds.UserCollaboration.responseAddInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.UserCollaboration.addInfo,
      ds.UserCollaboration.responseAddInfo> getAddingDetailsMethod() {
    io.grpc.MethodDescriptor<ds.UserCollaboration.addInfo, ds.UserCollaboration.responseAddInfo> getAddingDetailsMethod;
    if ((getAddingDetailsMethod = userCollaborationGrpc.getAddingDetailsMethod) == null) {
      synchronized (userCollaborationGrpc.class) {
        if ((getAddingDetailsMethod = userCollaborationGrpc.getAddingDetailsMethod) == null) {
          userCollaborationGrpc.getAddingDetailsMethod = getAddingDetailsMethod = 
              io.grpc.MethodDescriptor.<ds.UserCollaboration.addInfo, ds.UserCollaboration.responseAddInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "userCollaboration", "addingDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.UserCollaboration.addInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.UserCollaboration.responseAddInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new userCollaborationMethodDescriptorSupplier("addingDetails"))
                  .build();
          }
        }
     }
     return getAddingDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.UserCollaboration.selectViewInfo,
      ds.UserCollaboration.responseDataRecorded> getDisplayRecordedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayRecorded",
      requestType = ds.UserCollaboration.selectViewInfo.class,
      responseType = ds.UserCollaboration.responseDataRecorded.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.UserCollaboration.selectViewInfo,
      ds.UserCollaboration.responseDataRecorded> getDisplayRecordedMethod() {
    io.grpc.MethodDescriptor<ds.UserCollaboration.selectViewInfo, ds.UserCollaboration.responseDataRecorded> getDisplayRecordedMethod;
    if ((getDisplayRecordedMethod = userCollaborationGrpc.getDisplayRecordedMethod) == null) {
      synchronized (userCollaborationGrpc.class) {
        if ((getDisplayRecordedMethod = userCollaborationGrpc.getDisplayRecordedMethod) == null) {
          userCollaborationGrpc.getDisplayRecordedMethod = getDisplayRecordedMethod = 
              io.grpc.MethodDescriptor.<ds.UserCollaboration.selectViewInfo, ds.UserCollaboration.responseDataRecorded>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "userCollaboration", "displayRecorded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.UserCollaboration.selectViewInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.UserCollaboration.responseDataRecorded.getDefaultInstance()))
                  .setSchemaDescriptor(new userCollaborationMethodDescriptorSupplier("displayRecorded"))
                  .build();
          }
        }
     }
     return getDisplayRecordedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userCollaborationStub newStub(io.grpc.Channel channel) {
    return new userCollaborationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userCollaborationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userCollaborationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userCollaborationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userCollaborationFutureStub(channel);
  }

  /**
   */
  public static abstract class userCollaborationImplBase implements io.grpc.BindableService {

    /**
     */
    public void enterLocation(ds.UserCollaboration.enterCity request,
        io.grpc.stub.StreamObserver<ds.UserCollaboration.displayLocationDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterLocationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.UserCollaboration.addInfo> addingDetails(
        io.grpc.stub.StreamObserver<ds.UserCollaboration.responseAddInfo> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddingDetailsMethod(), responseObserver);
    }

    /**
     */
    public void displayRecorded(ds.UserCollaboration.selectViewInfo request,
        io.grpc.stub.StreamObserver<ds.UserCollaboration.responseDataRecorded> responseObserver) {
      asyncUnimplementedUnaryCall(getDisplayRecordedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnterLocationMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.UserCollaboration.enterCity,
                ds.UserCollaboration.displayLocationDetails>(
                  this, METHODID_ENTER_LOCATION)))
          .addMethod(
            getAddingDetailsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.UserCollaboration.addInfo,
                ds.UserCollaboration.responseAddInfo>(
                  this, METHODID_ADDING_DETAILS)))
          .addMethod(
            getDisplayRecordedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.UserCollaboration.selectViewInfo,
                ds.UserCollaboration.responseDataRecorded>(
                  this, METHODID_DISPLAY_RECORDED)))
          .build();
    }
  }

  /**
   */
  public static final class userCollaborationStub extends io.grpc.stub.AbstractStub<userCollaborationStub> {
    private userCollaborationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userCollaborationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userCollaborationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userCollaborationStub(channel, callOptions);
    }

    /**
     */
    public void enterLocation(ds.UserCollaboration.enterCity request,
        io.grpc.stub.StreamObserver<ds.UserCollaboration.displayLocationDetails> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getEnterLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.UserCollaboration.addInfo> addingDetails(
        io.grpc.stub.StreamObserver<ds.UserCollaboration.responseAddInfo> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAddingDetailsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void displayRecorded(ds.UserCollaboration.selectViewInfo request,
        io.grpc.stub.StreamObserver<ds.UserCollaboration.responseDataRecorded> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDisplayRecordedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userCollaborationBlockingStub extends io.grpc.stub.AbstractStub<userCollaborationBlockingStub> {
    private userCollaborationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userCollaborationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userCollaborationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userCollaborationBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.UserCollaboration.displayLocationDetails> enterLocation(
        ds.UserCollaboration.enterCity request) {
      return blockingServerStreamingCall(
          getChannel(), getEnterLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.UserCollaboration.responseDataRecorded> displayRecorded(
        ds.UserCollaboration.selectViewInfo request) {
      return blockingServerStreamingCall(
          getChannel(), getDisplayRecordedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userCollaborationFutureStub extends io.grpc.stub.AbstractStub<userCollaborationFutureStub> {
    private userCollaborationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userCollaborationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userCollaborationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userCollaborationFutureStub(channel, callOptions);
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
    private final userCollaborationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userCollaborationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER_LOCATION:
          serviceImpl.enterLocation((ds.UserCollaboration.enterCity) request,
              (io.grpc.stub.StreamObserver<ds.UserCollaboration.displayLocationDetails>) responseObserver);
          break;
        case METHODID_DISPLAY_RECORDED:
          serviceImpl.displayRecorded((ds.UserCollaboration.selectViewInfo) request,
              (io.grpc.stub.StreamObserver<ds.UserCollaboration.responseDataRecorded>) responseObserver);
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
              (io.grpc.stub.StreamObserver<ds.UserCollaboration.responseAddInfo>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userCollaborationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userCollaborationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.UserCollaboration.userCollaborationImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userCollaboration");
    }
  }

  private static final class userCollaborationFileDescriptorSupplier
      extends userCollaborationBaseDescriptorSupplier {
    userCollaborationFileDescriptorSupplier() {}
  }

  private static final class userCollaborationMethodDescriptorSupplier
      extends userCollaborationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userCollaborationMethodDescriptorSupplier(String methodName) {
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
      synchronized (userCollaborationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userCollaborationFileDescriptorSupplier())
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
