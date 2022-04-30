package ds.Client;

import ds.Service1.displayCityInfo;
import ds.Service1.enterLocation;
import ds.Service1.service1Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class Client_Service1 {

	public static void main(String[] args) throws InterruptedException {
		
	//Build a channel - connects the client to the server
		
		//specify the server and the port
		int port = 50051;
		String host = "localhost";
		
		//Generic code is generic
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
		service1Grpc.service1Stub asyncStub = service1Grpc.newStub(channel);			
		
		
		//Now build a message 
		
		////Client streaming - method: displayLocation, request: enterLocation, response:displayCityInfo
		
		
				StreamObserver<displayCityInfo> responseObserver = new StreamObserver<displayCityInfo>()
				{

					@Override
					public void onNext(displayCityInfo value) {
						
						System.out.println("Server says: " + value.getDataCityInfo());
						System.out.println("Server says: " + value.getEmptyCityInput());
						System.out.println("Server says: " + value.getErrorMessage());
						
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
	
	StreamObserver<enterLocation> requestObserver = asyncStub.displayLocation(responseObserver);
	
	requestObserver.onNext(enterLocation.newBuilder().setDataCityInfo("Dublin").build());
	
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	    requestObserver.onCompleted();
    
try {
	Thread.sleep(4500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
channel.shutdownNow();

}

}

