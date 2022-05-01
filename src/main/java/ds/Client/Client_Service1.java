package ds.Client;

import java.util.Iterator;

import ds.Service1.verifyStationRequested;
import ds.Service1.waterAirQuality;
import ds.Service1.displayCityInfo;
import ds.Service1.enterLocation;
import ds.Service1.scanCityEntered;
import ds.Service1.service1Grpc;
import ds.Service1.service1Grpc.service1BlockingStub;
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
		service1Grpc.service1Stub asyncStubB = service1Grpc.newStub(channel);
		service1BlockingStub stubB = service1Grpc.newBlockingStub(channel);
		
		
		
		//Client streaming - method: displayLocation, request: enterLocation, response:displayCityInfo
		
		//Now building the message 
		
				StreamObserver<displayCityInfo> responseObserver = new StreamObserver<displayCityInfo>()
				{

					@Override
					public void onNext(displayCityInfo value) {
						
						
						 System.out.println(" The city entered was " + value.getDataCityInfo());
						 
						
					}

					@Override
					public void onError(Throwable t) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onCompleted() {
						// TODO Auto-generated method stub
					
						//To wait a bit before execute next method
						try {
							Thread.sleep(15000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
										
					};

	
    // Now building up the response for Client Streaming
    
	
	StreamObserver<enterLocation> requestObserver = asyncStub.displayLocation(responseObserver);
	
	requestObserver.onNext(enterLocation.newBuilder().setDataCityInfo("Dublin").build());
	 System.out.println("=============================================================");
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
 
   //channel.shutdownNow();
   	
		        
  /*Bidirectional Streaming - method: checkingMonitoringStations, request:scanCityEntered, response: verifyStationRequested){}	 

StreamObserver<verifyStationRequested> responseOb = new StreamObserver<verifyStationRequested>() {
			
	        @Override
	        public void onNext(verifyStationRequested rm) {
	            System.out.println(rm.getDataCityInfo());
                    System.out.println(rm.getCheckingStation());
                    System.out.println(rm.getStationFound());
	        }

	        @Override
	        public void onCompleted() {
	        }

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}
	    };
	    
	    StreamObserver<scanCityEntered> requestOb = asyncStubB.checkingMonitoringStations(responseObserver);
	    
	    
	    	scanCityEntered rm = scanCityEntered.newBuilder().setDataCityInfo ("Roma").build();
	    	try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	requestOb.onNext(rm);
	    	//requestObserver.onCompleted();
	    	
	    }

	    requestObserver.onCompleted();
	    
	    while (true) {
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //channel.shutdownNow();
	    

	}*/

		

// Server Streaming
   
   System.out.println("=============================================================");
	verifyStationRequested request = verifyStationRequested.newBuilder().setDataCityInfo(" Dublin ").build();	
	
	Iterator<waterAirQuality> responses = stubB.airQualityResponse(request);
	while (responses.hasNext()) {
		waterAirQuality rm = responses.next();
		System.out.println(String.valueOf( rm.getDataCityInfo()));
		System.out.println(String.valueOf( rm.getStationFound()));
		System.out.println(String.valueOf( rm.getReportAirQuality()));
	}
	channel.shutdownNow();

	};
}






