package ds.Client;


import java.util.concurrent.TimeUnit;


import ds.Service2.identifyPeriod;
import ds.Service2.periodRequested;
import ds.Service2.resourseType;
import ds.Service2.service2Grpc;
import ds.Service2.service2Grpc.service2BlockingStub;
import ds.Service2.service2Grpc.service2Stub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class Client_Service2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Build a channel - connects the client to the server
		
		//specify the server and the port
		int port = 50052;
		String host = "localhost";
		
		//Generic code is generic
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		
		//Now build a message 
		
		
		resourseType myResourseType = resourseType.newBuilder().setMyResourseType("Water").build();
		
		
		//Creating a blocking stub, pass the channel to the stub 
		//The stub is specific to the service
		//The stub is a local representation of our remote object(service)
		
		service2BlockingStub bstub = service2Grpc.newBlockingStub(newChannel);
		service2Stub asyncStub = service2Grpc.newStub(newChannel);
		
		//The service has methods(rpcs)which I can call
		
		//Unary code - Now I can actually call the service and get a response back
				
		resourseType response = bstub.getEnterNaturalResourcetype(myResourseType); //passing over my request
		System.out.println(response.getMyResourseType());
		
		//calling the other rpc that I have on the service
		
		//Client Streaming code - for incoming messages we need to implement a StreamObserver
		//then we pass the StreamObsever to the grpc Library
		
		StreamObserver<identifyPeriod> responseObserver = new StreamObserver<identifyPeriod>() {

		
			@Override
			public void onNext(identifyPeriod value) {
				// TODO Auto-generated method stub
				System.out.println("Please enter the period requested to consult Water Polluition: "+ value.getPeriodMsg());
				
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}

		};
		
		//GRPC library reurns a StreamObserver to us: requestObserver
		//I use this to send out outgoing, messages
		
				
		StreamObserver<periodRequested>	requestOb = asyncStub.requestPeriod(responseObserver);
		
		requestOb.onNext(periodRequested.newBuilder().setStartDate("  This is the start date of the consultated period: 2020-06-09").build());
		requestOb.onNext(periodRequested.newBuilder().setEndDate("  This is the end date of the consultated period: 2020-09-09").build());
		requestOb.onNext(periodRequested.newBuilder().setEndDate("Client has now sent its messages").build());
		System.out.println("================================= ");
		
		
		requestOb.onCompleted();
		
		Thread.sleep(5000);
		
		//Server Streaming
		
		//reportAirWaterQuality responseQuality = bstub.getReturnAirQualitybyPeriod(identifyPeriod); //passing over my request
		//System.out.println("This is our report from this period  : " + responseQuality.getReturnAirQualitybyPeriod());
		
		//clean up:shutdown the channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		
		
	}
}