package ds.SearchingByLocation;

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
    comments = "Source: searchingByLocation.proto")
public final class searchingByLocationGrpc {

  private searchingByLocationGrpc() {}

  public static final String SERVICE_NAME = "searchingByLocation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.SearchingByLocation.enterLocation,
      ds.SearchingByLocation.displayCityInfo> getDisplayLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayLocation",
      requestType = ds.SearchingByLocation.enterLocation.class,
      responseType = ds.SearchingByLocation.displayCityInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.SearchingByLocation.enterLocation,
      ds.SearchingByLocation.displayCityInfo> getDisplayLocationMethod() {
    io.grpc.MethodDescriptor<ds.SearchingByLocation.enterLocation, ds.SearchingByLocation.displayCityInfo> getDisplayLocationMethod;
    if ((getDisplayLocationMethod = searchingByLocationGrpc.getDisplayLocationMethod) == null) {
      synchronized (searchingByLocationGrpc.class) {
        if ((getDisplayLocationMethod = searchingByLocationGrpc.getDisplayLocationMethod) == null) {
          searchingByLocationGrpc.getDisplayLocationMethod = getDisplayLocationMethod = 
              io.grpc.MethodDescriptor.<ds.SearchingByLocation.enterLocation, ds.SearchingByLocation.displayCityInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "searchingByLocation", "displayLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SearchingByLocation.enterLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SearchingByLocation.displayCityInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new searchingByLocationMethodDescriptorSupplier("displayLocation"))
                  .build();
          }
        }
     }
     return getDisplayLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.SearchingByLocation.scanCityEntered,
      ds.SearchingByLocation.verifyStationRequested> getCheckingMonitoringStationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkingMonitoringStations",
      requestType = ds.SearchingByLocation.scanCityEntered.class,
      responseType = ds.SearchingByLocation.verifyStationRequested.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.SearchingByLocation.scanCityEntered,
      ds.SearchingByLocation.verifyStationRequested> getCheckingMonitoringStationsMethod() {
    io.grpc.MethodDescriptor<ds.SearchingByLocation.scanCityEntered, ds.SearchingByLocation.verifyStationRequested> getCheckingMonitoringStationsMethod;
    if ((getCheckingMonitoringStationsMethod = searchingByLocationGrpc.getCheckingMonitoringStationsMethod) == null) {
      synchronized (searchingByLocationGrpc.class) {
        if ((getCheckingMonitoringStationsMethod = searchingByLocationGrpc.getCheckingMonitoringStationsMethod) == null) {
          searchingByLocationGrpc.getCheckingMonitoringStationsMethod = getCheckingMonitoringStationsMethod = 
              io.grpc.MethodDescriptor.<ds.SearchingByLocation.scanCityEntered, ds.SearchingByLocation.verifyStationRequested>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "searchingByLocation", "checkingMonitoringStations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SearchingByLocation.scanCityEntered.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SearchingByLocation.verifyStationRequested.getDefaultInstance()))
                  .setSchemaDescriptor(new searchingByLocationMethodDescriptorSupplier("checkingMonitoringStations"))
                  .build();
          }
        }
     }
     return getCheckingMonitoringStationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.SearchingByLocation.verifyStationRequested,
      ds.SearchingByLocation.waterAirQuality> getAirQualityResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "airQualityResponse",
      requestType = ds.SearchingByLocation.verifyStationRequested.class,
      responseType = ds.SearchingByLocation.waterAirQuality.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.SearchingByLocation.verifyStationRequested,
      ds.SearchingByLocation.waterAirQuality> getAirQualityResponseMethod() {
    io.grpc.MethodDescriptor<ds.SearchingByLocation.verifyStationRequested, ds.SearchingByLocation.waterAirQuality> getAirQualityResponseMethod;
    if ((getAirQualityResponseMethod = searchingByLocationGrpc.getAirQualityResponseMethod) == null) {
      synchronized (searchingByLocationGrpc.class) {
        if ((getAirQualityResponseMethod = searchingByLocationGrpc.getAirQualityResponseMethod) == null) {
          searchingByLocationGrpc.getAirQualityResponseMethod = getAirQualityResponseMethod = 
              io.grpc.MethodDescriptor.<ds.SearchingByLocation.verifyStationRequested, ds.SearchingByLocation.waterAirQuality>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "searchingByLocation", "airQualityResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SearchingByLocation.verifyStationRequested.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.SearchingByLocation.waterAirQuality.getDefaultInstance()))
                  .setSchemaDescriptor(new searchingByLocationMethodDescriptorSupplier("airQualityResponse"))
                  .build();
          }
        }
     }
     return getAirQualityResponseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static searchingByLocationStub newStub(io.grpc.Channel channel) {
    return new searchingByLocationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static searchingByLocationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new searchingByLocationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static searchingByLocationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new searchingByLocationFutureStub(channel);
  }

  /**
   */
  public static abstract class searchingByLocationImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<ds.SearchingByLocation.enterLocation> displayLocation(
        io.grpc.stub.StreamObserver<ds.SearchingByLocation.displayCityInfo> responseObserver) {
      return asyncUnimplementedStreamingCall(getDisplayLocationMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.SearchingByLocation.scanCityEntered> checkingMonitoringStations(
        io.grpc.stub.StreamObserver<ds.SearchingByLocation.verifyStationRequested> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckingMonitoringStationsMethod(), responseObserver);
    }

    /**
     */
    public void airQualityResponse(ds.SearchingByLocation.verifyStationRequested request,
        io.grpc.stub.StreamObserver<ds.SearchingByLocation.waterAirQuality> responseObserver) {
      asyncUnimplementedUnaryCall(getAirQualityResponseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDisplayLocationMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.SearchingByLocation.enterLocation,
                ds.SearchingByLocation.displayCityInfo>(
                  this, METHODID_DISPLAY_LOCATION)))
          .addMethod(
            getCheckingMonitoringStationsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.SearchingByLocation.scanCityEntered,
                ds.SearchingByLocation.verifyStationRequested>(
                  this, METHODID_CHECKING_MONITORING_STATIONS)))
          .addMethod(
            getAirQualityResponseMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.SearchingByLocation.verifyStationRequested,
                ds.SearchingByLocation.waterAirQuality>(
                  this, METHODID_AIR_QUALITY_RESPONSE)))
          .build();
    }
  }

  /**
   */
  public static final class searchingByLocationStub extends io.grpc.stub.AbstractStub<searchingByLocationStub> {
    private searchingByLocationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchingByLocationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchingByLocationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchingByLocationStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.SearchingByLocation.enterLocation> displayLocation(
        io.grpc.stub.StreamObserver<ds.SearchingByLocation.displayCityInfo> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getDisplayLocationMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.SearchingByLocation.scanCityEntered> checkingMonitoringStations(
        io.grpc.stub.StreamObserver<ds.SearchingByLocation.verifyStationRequested> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckingMonitoringStationsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void airQualityResponse(ds.SearchingByLocation.verifyStationRequested request,
        io.grpc.stub.StreamObserver<ds.SearchingByLocation.waterAirQuality> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAirQualityResponseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class searchingByLocationBlockingStub extends io.grpc.stub.AbstractStub<searchingByLocationBlockingStub> {
    private searchingByLocationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchingByLocationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchingByLocationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchingByLocationBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<ds.SearchingByLocation.waterAirQuality> airQualityResponse(
        ds.SearchingByLocation.verifyStationRequested request) {
      return blockingServerStreamingCall(
          getChannel(), getAirQualityResponseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class searchingByLocationFutureStub extends io.grpc.stub.AbstractStub<searchingByLocationFutureStub> {
    private searchingByLocationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchingByLocationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchingByLocationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchingByLocationFutureStub(channel, callOptions);
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
    private final searchingByLocationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(searchingByLocationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AIR_QUALITY_RESPONSE:
          serviceImpl.airQualityResponse((ds.SearchingByLocation.verifyStationRequested) request,
              (io.grpc.stub.StreamObserver<ds.SearchingByLocation.waterAirQuality>) responseObserver);
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
              (io.grpc.stub.StreamObserver<ds.SearchingByLocation.displayCityInfo>) responseObserver);
        case METHODID_CHECKING_MONITORING_STATIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkingMonitoringStations(
              (io.grpc.stub.StreamObserver<ds.SearchingByLocation.verifyStationRequested>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class searchingByLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    searchingByLocationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.SearchingByLocation.searchingByLocationImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("searchingByLocation");
    }
  }

  private static final class searchingByLocationFileDescriptorSupplier
      extends searchingByLocationBaseDescriptorSupplier {
    searchingByLocationFileDescriptorSupplier() {}
  }

  private static final class searchingByLocationMethodDescriptorSupplier
      extends searchingByLocationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    searchingByLocationMethodDescriptorSupplier(String methodName) {
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
      synchronized (searchingByLocationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new searchingByLocationFileDescriptorSupplier())
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
