package ds.Service2;

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

import io.grpc.stub.StreamObserver;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class service2Grpc {

  private service2Grpc() {}

  public static final String SERVICE_NAME = "service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.Service2.periodRequested,
      ds.Service2.identifyPeriod> getRequestPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "requestPeriod",
      requestType = ds.Service2.periodRequested.class,
      responseType = ds.Service2.identifyPeriod.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service2.periodRequested,
      ds.Service2.identifyPeriod> getRequestPeriodMethod() {
    io.grpc.MethodDescriptor<ds.Service2.periodRequested, ds.Service2.identifyPeriod> getRequestPeriodMethod;
    if ((getRequestPeriodMethod = service2Grpc.getRequestPeriodMethod) == null) {
      synchronized (service2Grpc.class) {
        if ((getRequestPeriodMethod = service2Grpc.getRequestPeriodMethod) == null) {
          service2Grpc.getRequestPeriodMethod = getRequestPeriodMethod = 
              io.grpc.MethodDescriptor.<ds.Service2.periodRequested, ds.Service2.identifyPeriod>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2", "requestPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service2.periodRequested.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service2.identifyPeriod.getDefaultInstance()))
                  .setSchemaDescriptor(new service2MethodDescriptorSupplier("requestPeriod"))
                  .build();
          }
        }
     }
     return getRequestPeriodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.Service2.resourseType,
      ds.Service2.registrationTypeResponse> getEnterNaturalResourcetypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enterNaturalResourcetype",
      requestType = ds.Service2.resourseType.class,
      responseType = ds.Service2.registrationTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.Service2.resourseType,
      ds.Service2.registrationTypeResponse> getEnterNaturalResourcetypeMethod() {
    io.grpc.MethodDescriptor<ds.Service2.resourseType, ds.Service2.registrationTypeResponse> getEnterNaturalResourcetypeMethod;
    if ((getEnterNaturalResourcetypeMethod = service2Grpc.getEnterNaturalResourcetypeMethod) == null) {
      synchronized (service2Grpc.class) {
        if ((getEnterNaturalResourcetypeMethod = service2Grpc.getEnterNaturalResourcetypeMethod) == null) {
          service2Grpc.getEnterNaturalResourcetypeMethod = getEnterNaturalResourcetypeMethod = 
              io.grpc.MethodDescriptor.<ds.Service2.resourseType, ds.Service2.registrationTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2", "enterNaturalResourcetype"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service2.resourseType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service2.registrationTypeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new service2MethodDescriptorSupplier("enterNaturalResourcetype"))
                  .build();
          }
        }
     }
     return getEnterNaturalResourcetypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.Service2.identifyPeriod,
      ds.Service2.reportAirWaterQuality> getReturnAirQualitybyPeriodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "returnAirQualitybyPeriod",
      requestType = ds.Service2.identifyPeriod.class,
      responseType = ds.Service2.reportAirWaterQuality.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service2.identifyPeriod,
      ds.Service2.reportAirWaterQuality> getReturnAirQualitybyPeriodMethod() {
    io.grpc.MethodDescriptor<ds.Service2.identifyPeriod, ds.Service2.reportAirWaterQuality> getReturnAirQualitybyPeriodMethod;
    if ((getReturnAirQualitybyPeriodMethod = service2Grpc.getReturnAirQualitybyPeriodMethod) == null) {
      synchronized (service2Grpc.class) {
        if ((getReturnAirQualitybyPeriodMethod = service2Grpc.getReturnAirQualitybyPeriodMethod) == null) {
          service2Grpc.getReturnAirQualitybyPeriodMethod = getReturnAirQualitybyPeriodMethod = 
              io.grpc.MethodDescriptor.<ds.Service2.identifyPeriod, ds.Service2.reportAirWaterQuality>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2", "returnAirQualitybyPeriod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service2.identifyPeriod.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service2.reportAirWaterQuality.getDefaultInstance()))
                  .setSchemaDescriptor(new service2MethodDescriptorSupplier("returnAirQualitybyPeriod"))
                  .build();
          }
        }
     }
     return getReturnAirQualitybyPeriodMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static service2Stub newStub(io.grpc.Channel channel) {
    return new service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new service2FutureStub(channel);
  }

  /**
   */
  public static abstract class service2ImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service2.periodRequested> requestPeriod(
        io.grpc.stub.StreamObserver<ds.Service2.identifyPeriod> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestPeriodMethod(), responseObserver);
    }

    /**
     */
    public void enterNaturalResourcetype(ds.Service2.resourseType request,
        io.grpc.stub.StreamObserver<ds.Service2.registrationTypeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterNaturalResourcetypeMethod(), responseObserver);
    }

    /**
     */
    public void returnAirQualitybyPeriod(ds.Service2.identifyPeriod request,
        io.grpc.stub.StreamObserver<ds.Service2.reportAirWaterQuality> responseObserver) {
      asyncUnimplementedUnaryCall(getReturnAirQualitybyPeriodMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestPeriodMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.Service2.periodRequested,
                ds.Service2.identifyPeriod>(
                  this, METHODID_REQUEST_PERIOD)))
          .addMethod(
            getEnterNaturalResourcetypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.Service2.resourseType,
                ds.Service2.registrationTypeResponse>(
                  this, METHODID_ENTER_NATURAL_RESOURCETYPE)))
          .addMethod(
            getReturnAirQualitybyPeriodMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.Service2.identifyPeriod,
                ds.Service2.reportAirWaterQuality>(
                  this, METHODID_RETURN_AIR_QUALITYBY_PERIOD)))
          .build();
    }

	public void getEnterNaturalResourcetype(resourseType request,
			StreamObserver<registrationTypeResponse> responseObserver) {
		// TODO Auto-generated method stub
		
	}
  }

  /**
   */
  public static final class service2Stub extends io.grpc.stub.AbstractStub<service2Stub> {
    private service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service2Stub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service2.periodRequested> requestPeriod(
        io.grpc.stub.StreamObserver<ds.Service2.identifyPeriod> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRequestPeriodMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void enterNaturalResourcetype(ds.Service2.resourseType request,
        io.grpc.stub.StreamObserver<ds.Service2.registrationTypeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnterNaturalResourcetypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void returnAirQualitybyPeriod(ds.Service2.identifyPeriod request,
        io.grpc.stub.StreamObserver<ds.Service2.reportAirWaterQuality> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReturnAirQualitybyPeriodMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class service2BlockingStub extends io.grpc.stub.AbstractStub<service2BlockingStub> {
    private service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service2BlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.Service2.registrationTypeResponse enterNaturalResourcetype(ds.Service2.resourseType request) {
      return blockingUnaryCall(
          getChannel(), getEnterNaturalResourcetypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.Service2.reportAirWaterQuality> returnAirQualitybyPeriod(
        ds.Service2.identifyPeriod request) {
      return blockingServerStreamingCall(
          getChannel(), getReturnAirQualitybyPeriodMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class service2FutureStub extends io.grpc.stub.AbstractStub<service2FutureStub> {
    private service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.Service2.registrationTypeResponse> enterNaturalResourcetype(
        ds.Service2.resourseType request) {
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
    private final service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENTER_NATURAL_RESOURCETYPE:
          serviceImpl.enterNaturalResourcetype((ds.Service2.resourseType) request,
              (io.grpc.stub.StreamObserver<ds.Service2.registrationTypeResponse>) responseObserver);
          break;
        case METHODID_RETURN_AIR_QUALITYBY_PERIOD:
          serviceImpl.returnAirQualitybyPeriod((ds.Service2.identifyPeriod) request,
              (io.grpc.stub.StreamObserver<ds.Service2.reportAirWaterQuality>) responseObserver);
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
              (io.grpc.stub.StreamObserver<ds.Service2.identifyPeriod>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.Service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("service2");
    }
  }

  private static final class service2FileDescriptorSupplier
      extends service2BaseDescriptorSupplier {
    service2FileDescriptorSupplier() {}
  }

  private static final class service2MethodDescriptorSupplier
      extends service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new service2FileDescriptorSupplier())
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
