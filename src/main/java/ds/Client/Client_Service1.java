package ds.Client;

import ds.Service1.displayCityInfo;
import ds.Service1.enterLocation;
import ds.Service1.service1Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;


public class Client_Service1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Build a channel - connects the client to the server
		
		//specify the server and the port
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();	
		service1Grpc.service1Stub stub = service1Grpc.newStub(channel);
		
		//Now build a message 
		StreamObserver<displayCityInfo> responseObserver = new StreamObserver<displayCityInfo>()
		{



		@Override
		public void onNext(displayCityInfo value)
		{
		System.out.println("Server says: " + value.getDataCityInfo());
		System.out.println("Server says: " + value.getEmptyCityInput());
		System.out.println("Server says: " + value.getErrorMessage());
		
		}
		@Override
		public void onCompleted() {
		}
		
		
		@Override
		public void onError(Throwable t)
		{
		// TODO Auto-generated method stub

		}
		};

		

		// gRPC library returns a StreamObserver to us: requestObserver
		// we use this to send out outgoing messages
		StreamObserver<enterLocation> requestObserver = stub.displayLocation(responseObserver);

		requestObserver.onNext(enterLocation.newBuilder().setDataCityInfo("Roma").build());
		
		requestObserver.onNext(enterLocation.newBuilder().setDataCityInfo("Ottawa").build());
		
		requestObserver.onNext(enterLocation.newBuilder().setDataCityInfo("Dublin").build());

		requestObserver.onCompleted();

		//Thread.sleep(4000);
		//channel.shutdown().awaitTermination(100, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	


}
