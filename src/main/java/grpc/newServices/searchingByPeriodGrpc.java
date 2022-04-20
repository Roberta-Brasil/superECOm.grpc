package grpc.newServices;

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
    comments = "Source: searchingByPeriod.proto")
public final class searchingByPeriodGrpc {

  private searchingByPeriodGrpc() {}

  public static final String SERVICE_NAME = "searchingByPeriod";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.newServices.periodRequested,
      grpc.newServices.identifyPeriod> getRequestPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "requestPeriod",
      requestType = grpc.newServices.periodRequested.class,
      responseType = grpc.newServices.identifyPeriod.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newServices.periodRequested,
      grpc.newServices.identifyPeriod> getRequestPeriodMethod() {
    io.grpc.MethodDescriptor<grpc.newServices.periodRequested, grpc.newServices.identifyPeriod> getRequestPeriodMethod;
    if ((getRequestPeriodMethod = searchingByPeriodGrpc.getRequestPeriodMethod) == null) {
      synchronized (searchingByPeriodGrpc.class) {
        if ((getRequestPeriodMethod = searchingByPeriodGrpc.getRequestPeriodMethod) == null) {
          searchingByPeriodGrpc.getRequestPeriodMethod = getRequestPeriodMethod = 
              io.grpc.MethodDescriptor.<grpc.newServices.periodRequested, grpc.newServices.identifyPeriod>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "searchingByPeriod", "requestPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newServices.periodRequested.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newServices.identifyPeriod.getDefaultInstance()))
                  .setSchemaDescriptor(new searchingByPeriodMethodDescriptorSupplier("requestPeriod"))
                  .build();
          }
        }
     }
     return getRequestPeriodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newServices.resourseType,
      grpc.newServices.registrationTypeResponse> getEnterNaturalResourcetypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enterNaturalResourcetype",
      requestType = grpc.newServices.resourseType.class,
      responseType = grpc.newServices.registrationTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newServices.resourseType,
      grpc.newServices.registrationTypeResponse> getEnterNaturalResourcetypeMethod() {
    io.grpc.MethodDescriptor<grpc.newServices.resourseType, grpc.newServices.registrationTypeResponse> getEnterNaturalResourcetypeMethod;
    if ((getEnterNaturalResourcetypeMethod = searchingByPeriodGrpc.getEnterNaturalResourcetypeMethod) == null) {
      synchronized (searchingByPeriodGrpc.class) {
        if ((getEnterNaturalResourcetypeMethod = searchingByPeriodGrpc.getEnterNaturalResourcetypeMethod) == null) {
          searchingByPeriodGrpc.getEnterNaturalResourcetypeMethod = getEnterNaturalResourcetypeMethod = 
              io.grpc.MethodDescriptor.<grpc.newServices.resourseType, grpc.newServices.registrationTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "searchingByPeriod", "enterNaturalResourcetype"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newServices.resourseType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newServices.registrationTypeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchingByPeriodMethodDescriptorSupplier("enterNaturalResourcetype"))
                  .build();
          }
        }
     }
     return getEnterNaturalResourcetypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newServices.identifyPeriod,
      grpc.newServices.reportAirWaterQuality> getReturnAirQualitybyPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "returnAirQualitybyPeriod",
      requestType = grpc.newServices.identifyPeriod.class,
      responseType = grpc.newServices.reportAirWaterQuality.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newServices.identifyPeriod,
      grpc.newServices.reportAirWaterQuality> getReturnAirQualitybyPeriodMethod() {
    io.grpc.MethodDescriptor<grpc.newServices.identifyPeriod, grpc.newServices.reportAirWaterQuality> getReturnAirQualitybyPeriodMethod;
    if ((getReturnAirQualitybyPeriodMethod = searchingByPeriodGrpc.getReturnAirQualitybyPeriodMethod) == null) {
      synchronized (searchingByPeriodGrpc.class) {
        if ((getReturnAirQualitybyPeriodMethod = searchingByPeriodGrpc.getReturnAirQualitybyPeriodMethod) == null) {
          searchingByPeriodGrpc.getReturnAirQualitybyPeriodMethod = getReturnAirQualitybyPeriodMethod = 
              io.grpc.MethodDescriptor.<grpc.newServices.identifyPeriod, grpc.newServices.reportAirWaterQuality>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "searchingByPeriod", "returnAirQualitybyPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newServices.identifyPeriod.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newServices.reportAirWaterQuality.getDefaultInstance()))
                  .setSchemaDescriptor(new searchingByPeriodMethodDescriptorSupplier("returnAirQualitybyPeriod"))
                  .build();
          }
        }
     }
     return getReturnAirQualitybyPeriodMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static searchingByPeriodStub newStub(io.grpc.Channel channel) {
    return new searchingByPeriodStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static searchingByPeriodBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new searchingByPeriodBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static searchingByPeriodFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new searchingByPeriodFutureStub(channel);
  }

  /**
   */
  public static abstract class searchingByPeriodImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.newServices.periodRequested> requestPeriod(
        io.grpc.stub.StreamObserver<grpc.newServices.identifyPeriod> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestPeriodMethod(), responseObserver);
    }

    /**
     */
    public void enterNaturalResourcetype(grpc.newServices.resourseType request,
        io.grpc.stub.StreamObserver<grpc.newServices.registrationTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterNaturalResourcetypeMethod(), responseObserver);
    }

    /**
     */
    public void returnAirQualitybyPeriod(grpc.newServices.identifyPeriod request,
        io.grpc.stub.StreamObserver<grpc.newServices.reportAirWaterQuality> responseObserver) {
      asyncUnimplementedUnaryCall(getReturnAirQualitybyPeriodMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestPeriodMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.newServices.periodRequested,
                grpc.newServices.identifyPeriod>(
                  this, METHODID_REQUEST_PERIOD)))
          .addMethod(
            getEnterNaturalResourcetypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newServices.resourseType,
                grpc.newServices.registrationTypeResponse>(
                  this, METHODID_ENTER_NATURAL_RESOURCETYPE)))
          .addMethod(
            getReturnAirQualitybyPeriodMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.newServices.identifyPeriod,
                grpc.newServices.reportAirWaterQuality>(
                  this, METHODID_RETURN_AIR_QUALITYBY_PERIOD)))
          .build();
    }
  }

  /**
   */
  public static final class searchingByPeriodStub extends io.grpc.stub.AbstractStub<searchingByPeriodStub> {
    private searchingByPeriodStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchingByPeriodStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchingByPeriodStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchingByPeriodStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.newServices.periodRequested> requestPeriod(
        io.grpc.stub.StreamObserver<grpc.newServices.identifyPeriod> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRequestPeriodMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void enterNaturalResourcetype(grpc.newServices.resourseType request,
        io.grpc.stub.StreamObserver<grpc.newServices.registrationTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnterNaturalResourcetypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void returnAirQualitybyPeriod(grpc.newServices.identifyPeriod request,
        io.grpc.stub.StreamObserver<grpc.newServices.reportAirWaterQuality> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReturnAirQualitybyPeriodMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class searchingByPeriodBlockingStub extends io.grpc.stub.AbstractStub<searchingByPeriodBlockingStub> {
    private searchingByPeriodBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchingByPeriodBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchingByPeriodBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchingByPeriodBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.newServices.registrationTypeResponse enterNaturalResourcetype(grpc.newServices.resourseType request) {
      return blockingUnaryCall(
          getChannel(), getEnterNaturalResourcetypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.newServices.reportAirWaterQuality> returnAirQualitybyPeriod(
        grpc.newServices.identifyPeriod request) {
      return blockingServerStreamingCall(
          getChannel(), getReturnAirQualitybyPeriodMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class searchingByPeriodFutureStub extends io.grpc.stub.AbstractStub<searchingByPeriodFutureStub> {
    private searchingByPeriodFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchingByPeriodFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchingByPeriodFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchingByPeriodFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newServices.registrationTypeResponse> enterNaturalResourcetype(
        grpc.newServices.resourseType request) {
      return futureUnaryCall(
          getChannel().newCall(getEnterNaturalResourcetypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ENTER_NATURAL_RESOURCETYPE = 0;
  private static final int METHODID_RETURN_AIR_QUALITYBY_PERIOD = 1;
  private static final int METHODID_REQUEST_PERIOD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final searchingByPeriodImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(searchingByPeriodImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER_NATURAL_RESOURCETYPE:
          serviceImpl.enterNaturalResourcetype((grpc.newServices.resourseType) request,
              (io.grpc.stub.StreamObserver<grpc.newServices.registrationTypeResponse>) responseObserver);
          break;
        case METHODID_RETURN_AIR_QUALITYBY_PERIOD:
          serviceImpl.returnAirQualitybyPeriod((grpc.newServices.identifyPeriod) request,
              (io.grpc.stub.StreamObserver<grpc.newServices.reportAirWaterQuality>) responseObserver);
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
        case METHODID_REQUEST_PERIOD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestPeriod(
              (io.grpc.stub.StreamObserver<grpc.newServices.identifyPeriod>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class searchingByPeriodBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    searchingByPeriodBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.newServices.searchingByPeriodImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("searchingByPeriod");
    }
  }

  private static final class searchingByPeriodFileDescriptorSupplier
      extends searchingByPeriodBaseDescriptorSupplier {
    searchingByPeriodFileDescriptorSupplier() {}
  }

  private static final class searchingByPeriodMethodDescriptorSupplier
      extends searchingByPeriodBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    searchingByPeriodMethodDescriptorSupplier(String methodName) {
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
      synchronized (searchingByPeriodGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new searchingByPeriodFileDescriptorSupplier())
              .addMethod(getRequestPeriodMethod())
              .addMethod(getEnterNaturalResourcetypeMethod())
              .addMethod(getReturnAirQualitybyPeriodMethod())
              .build();
        }
      }
    }
    return result;
  }
}
