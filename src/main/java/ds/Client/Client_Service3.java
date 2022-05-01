package ds.Client;


import java.util.Iterator;

import ds.Service3.addInfo;
import ds.Service3.displayLocationDetails;
import ds.Service3.enterCity;
import ds.Service3.responseAddInfo;
import ds.Service3.responseDataRecorded;
import ds.Service3.selectViewInfo;
import ds.Service3.service3Grpc;
import ds.Service3.service3Grpc.service3BlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class Client_Service3 {

	public static void main(String[] args) throws InterruptedException {

		//Build a channel - connects the client to the server

		//specify the server and the port
		int port = 50051;
		String host = "localhost";

		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();	
		
		//Declaring Stub
		service3Grpc.service3Stub asyncStub = service3Grpc.newStub(channel);
		service3BlockingStub stubB = service3Grpc.newBlockingStub(channel);
		service3BlockingStub stubB2 = service3Grpc.newBlockingStub(channel);
			
		// TODO Auto-generated method stub
		
		
     //Server Streaming - method: enterLocation, request: enterCity, response: displayLocationDetails.
		
				
				enterCity request = enterCity.newBuilder().setCityAdded("Please enter your City").build();	
				
				
				Iterator<displayLocationDetails> responses = stubB.enterLocation(request);
				while (responses.hasNext()) {
					displayLocationDetails rm1 = responses.next();
					System.out.println(String.valueOf( rm1.getCityAdded()));
			        System.out.println(String.valueOf( rm1.getLocationConfirmation()));
			        
				};
				//nChannel.shutdownNow();
				
		//Bidirectional Streaming - method:addingDetails, request: stream addInfo, response: responseAddInfo.		
				

          StreamObserver<responseAddInfo> responseObserver = new StreamObserver<responseAddInfo>() {
			
	        @Override
	        public void onNext(responseAddInfo rm) {
	                                   
                    System.out.println(rm.getResourcesMessageConfirmation());
                    System.out.println(rm.getLastAddedMsg());
                    System.out.println(rm.getNaturalResourceLastAdded());
	        }

	        @Override
	        public void onCompleted() {
	        }

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

		  };
	    
	    StreamObserver<addInfo> requestObserver = asyncStub.addingDetails(responseObserver);
	    
	    
	    for (int i = 0; i < 3; i++) {
	    	    addInfo rm = addInfo.newBuilder().setNaturalResourceId("The Natural resource ID is 0089" + i).build();
                addInfo rm0 = addInfo.newBuilder().setWind("The wind is 10 km" + i).build();
                addInfo rm1 = addInfo.newBuilder().setTemperature("The Temperature is 40 Deggres Celsius" + i).build();
                addInfo rm2 = addInfo.newBuilder().setTypeOfnaturalDisaster("The Type of Natural disaster is Fire" + i).build();
                addInfo rm3 = addInfo.newBuilder().setTypeOfPollutan("The type of pollutant is Petrol" + i).build();
                
	    	try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	requestObserver.onNext(rm);
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
	    

	}


		/*Server Streaming  - method:displayRecorded, request: selectViewInfo, response: responseDataRecorded.
		  
				
				selectViewInfo request1 = selectViewInfo.newBuilder().setViewInfoRegistered("The Info registered was: ").build();	
				
				
				Iterator<responseDataRecorded> responses1 = stubB.displayRecorded(request1);
				
				while (responses.hasNext()) {
					responseDataRecorded response = responses1.next();
					System.out.println(String.valueOf(rm2.getDisplayDataRecorded()));
			                System.out.println(String.valueOf( rm2.getCityDetails()));
			                System.out.println(String.valueOf( rm2.getNaturalResourceLastAdded()));
				}
				channel.shutdownNow();*/

				};
		
				
				
	
