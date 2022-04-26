package ds.Service1;

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
    comments = "Source: service1.proto")
public final class service1Grpc {

  private service1Grpc() {}

  public static final String SERVICE_NAME = "service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.Service1.enterLocation,
      ds.Service1.displayCityInfo> getDisplayLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayLocation",
      requestType = ds.Service1.enterLocation.class,
      responseType = ds.Service1.displayCityInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service1.enterLocation,
      ds.Service1.displayCityInfo> getDisplayLocationMethod() {
    io.grpc.MethodDescriptor<ds.Service1.enterLocation, ds.Service1.displayCityInfo> getDisplayLocationMethod;
    if ((getDisplayLocationMethod = service1Grpc.getDisplayLocationMethod) == null) {
      synchronized (service1Grpc.class) {
        if ((getDisplayLocationMethod = service1Grpc.getDisplayLocationMethod) == null) {
          service1Grpc.getDisplayLocationMethod = getDisplayLocationMethod = 
              io.grpc.MethodDescriptor.<ds.Service1.enterLocation, ds.Service1.displayCityInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1", "displayLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service1.enterLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service1.displayCityInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new service1MethodDescriptorSupplier("displayLocation"))
                  .build();
          }
        }
     }
     return getDisplayLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.Service1.scanCityEntered,
      ds.Service1.verifyStationRequested> getCheckingMonitoringStationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkingMonitoringStations",
      requestType = ds.Service1.scanCityEntered.class,
      responseType = ds.Service1.verifyStationRequested.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service1.scanCityEntered,
      ds.Service1.verifyStationRequested> getCheckingMonitoringStationsMethod() {
    io.grpc.MethodDescriptor<ds.Service1.scanCityEntered, ds.Service1.verifyStationRequested> getCheckingMonitoringStationsMethod;
    if ((getCheckingMonitoringStationsMethod = service1Grpc.getCheckingMonitoringStationsMethod) == null) {
      synchronized (service1Grpc.class) {
        if ((getCheckingMonitoringStationsMethod = service1Grpc.getCheckingMonitoringStationsMethod) == null) {
          service1Grpc.getCheckingMonitoringStationsMethod = getCheckingMonitoringStationsMethod = 
              io.grpc.MethodDescriptor.<ds.Service1.scanCityEntered, ds.Service1.verifyStationRequested>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1", "checkingMonitoringStations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service1.scanCityEntered.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service1.verifyStationRequested.getDefaultInstance()))
                  .setSchemaDescriptor(new service1MethodDescriptorSupplier("checkingMonitoringStations"))
                  .build();
          }
        }
     }
     return getCheckingMonitoringStationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.Service1.verifyStationRequested,
      ds.Service1.waterAirQuality> getAirQualityResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "airQualityResponse",
      requestType = ds.Service1.verifyStationRequested.class,
      responseType = ds.Service1.waterAirQuality.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.Service1.verifyStationRequested,
      ds.Service1.waterAirQuality> getAirQualityResponseMethod() {
    io.grpc.MethodDescriptor<ds.Service1.verifyStationRequested, ds.Service1.waterAirQuality> getAirQualityResponseMethod;
    if ((getAirQualityResponseMethod = service1Grpc.getAirQualityResponseMethod) == null) {
      synchronized (service1Grpc.class) {
        if ((getAirQualityResponseMethod = service1Grpc.getAirQualityResponseMethod) == null) {
          service1Grpc.getAirQualityResponseMethod = getAirQualityResponseMethod = 
              io.grpc.MethodDescriptor.<ds.Service1.verifyStationRequested, ds.Service1.waterAirQuality>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1", "airQualityResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service1.verifyStationRequested.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.Service1.waterAirQuality.getDefaultInstance()))
                  .setSchemaDescriptor(new service1MethodDescriptorSupplier("airQualityResponse"))
                  .build();
          }
        }
     }
     return getAirQualityResponseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static service1Stub newStub(io.grpc.Channel channel) {
    return new service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new service1FutureStub(channel);
  }

  /**
   */
  public static abstract class service1ImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service1.enterLocation> displayLocation(
        io.grpc.stub.StreamObserver<ds.Service1.displayCityInfo> responseObserver) {
      return asyncUnimplementedStreamingCall(getDisplayLocationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service1.scanCityEntered> checkingMonitoringStations(
        io.grpc.stub.StreamObserver<ds.Service1.verifyStationRequested> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckingMonitoringStationsMethod(), responseObserver);
    }

    /**
     */
    public void airQualityResponse(ds.Service1.verifyStationRequested request,
        io.grpc.stub.StreamObserver<ds.Service1.waterAirQuality> responseObserver) {
      asyncUnimplementedUnaryCall(getAirQualityResponseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDisplayLocationMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.Service1.enterLocation,
                ds.Service1.displayCityInfo>(
                  this, METHODID_DISPLAY_LOCATION)))
          .addMethod(
            getCheckingMonitoringStationsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.Service1.scanCityEntered,
                ds.Service1.verifyStationRequested>(
                  this, METHODID_CHECKING_MONITORING_STATIONS)))
          .addMethod(
            getAirQualityResponseMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.Service1.verifyStationRequested,
                ds.Service1.waterAirQuality>(
                  this, METHODID_AIR_QUALITY_RESPONSE)))
          .build();
    }
  }

  /**
   */
  public static final class service1Stub extends io.grpc.stub.AbstractStub<service1Stub> {
    private service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service1Stub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service1.enterLocation> displayLocation(
        io.grpc.stub.StreamObserver<ds.Service1.displayCityInfo> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getDisplayLocationMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.Service1.scanCityEntered> checkingMonitoringStations(
        io.grpc.stub.StreamObserver<ds.Service1.verifyStationRequested> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckingMonitoringStationsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void airQualityResponse(ds.Service1.verifyStationRequested request,
        io.grpc.stub.StreamObserver<ds.Service1.waterAirQuality> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAirQualityResponseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class service1BlockingStub extends io.grpc.stub.AbstractStub<service1BlockingStub> {
    private service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service1BlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.Service1.waterAirQuality> airQualityResponse(
        ds.Service1.verifyStationRequested request) {
      return blockingServerStreamingCall(
          getChannel(), getAirQualityResponseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class service1FutureStub extends io.grpc.stub.AbstractStub<service1FutureStub> {
    private service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service1FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AIR_QUALITY_RESPONSE = 0;
  private static final int METHODID_DISPLAY_LOCATION = 1;
  private static final int METHODID_CHECKING_MONITORING_STATIONS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AIR_QUALITY_RESPONSE:
          serviceImpl.airQualityResponse((ds.Service1.verifyStationRequested) request,
              (io.grpc.stub.StreamObserver<ds.Service1.waterAirQuality>) responseObserver);
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
        case METHODID_DISPLAY_LOCATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.displayLocation(
              (io.grpc.stub.StreamObserver<ds.Service1.displayCityInfo>) responseObserver);
        case METHODID_CHECKING_MONITORING_STATIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkingMonitoringStations(
              (io.grpc.stub.StreamObserver<ds.Service1.verifyStationRequested>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.Service1.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("service1");
    }
  }

  private static final class service1FileDescriptorSupplier
      extends service1BaseDescriptorSupplier {
    service1FileDescriptorSupplier() {}
  }

  private static final class service1MethodDescriptorSupplier
      extends service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new service1FileDescriptorSupplier())
              .addMethod(getDisplayLocationMethod())
              .addMethod(getCheckingMonitoringStationsMethod())
              .addMethod(getAirQualityResponseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
