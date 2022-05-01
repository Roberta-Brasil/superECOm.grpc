package ds.Client;

import java.util.Iterator;

import ds.Service2.identifyPeriod;
import ds.Service2.periodRequested;
import ds.Service2.registrationTypeResponse;
import ds.Service2.reportAirWaterQuality;
import ds.Service2.resourceType;
import ds.Service2.service2Grpc;
import ds.Service2.service2Grpc.service2BlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class Client_Service2 {

	public static void main(String[] args) throws InterruptedException {

		//Build a channel - connects the client to the server

		//specify the server and the port
		int port = 50052;
		String host = "localhost";

		ManagedChannel newChannel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();	
		
		//Declaring Stub
		service2Grpc.service2Stub asyncStub = service2Grpc.newStub(newChannel);
		service2BlockingStub stubB = service2Grpc.newBlockingStub(newChannel);

		//Client Streaming - Method:requestPeriod, request:periodRequested,response:identifyPeriod.

	    //Now building up the message for Client Streaming

	     StreamObserver<identifyPeriod> responseObserver = new StreamObserver<identifyPeriod>()
					{

						@Override
						public void onNext(identifyPeriod value) {
							
							System.out.println("Please enter the Period to consult Water/Air polluition : ");
													
						}

						@Override
						public void onError(Throwable t) {
							// TODO Auto-generated method stub
							
						}

						@Override
						public void onCompleted() {
							// TODO Auto-generated method stub
							
							try {
								Thread.sleep(15000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

										
						}
						};
		
						
		
	    // Now building up the response for Client Streaming
	    
		
		StreamObserver<periodRequested> requestObserver = asyncStub.requestPeriod(responseObserver);
		System.out.println("=============================================================");
		requestObserver.onNext(periodRequested.newBuilder().setStartDate(" The user entered from : 2021-05-06").setEndDate(" to 2021-08-06").build());
		
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
	 
	   //newChannel.shutdownNow();
		
		//Unary - Method: enterNaturalResourcetype, request:resourseType,response:registrationTypeResponse
		
	   System.out.println("=============================================================");
	   resourceType request = resourceType.newBuilder().setMyResourceType("On Server: Please enter the natural resource type to consult. It can be 'Water' 'Air' or'Both' ").build();

	   registrationTypeResponse response = stubB.enterNaturalResourcetype(request);

	   System.out.println(String.valueOf( response.getNaturalResourceRegistered ()));
	   
	   //newChannel.shutdownNow();

	   //Server Streaming - method: returnAirQualitybyPeriod, request: identifyPeriod, response: reportAirWaterQuality
	   
	    System.out.println("=============================================================");
		identifyPeriod request1 = identifyPeriod.newBuilder().setPeriodMsg("Searching report on the Database...").build();	
		
		
		Iterator<reportAirWaterQuality> responses = stubB.returnAirQualitybyPeriod(request1);
		while (responses.hasNext()) {
			reportAirWaterQuality rm = responses.next();
			System.out.println(String.valueOf( rm.getPeriodMsg()));
			System.out.println(String.valueOf( rm.getMyResourceType()));
			System.out.println(String.valueOf( rm.getQualityReport()));
	                
		}
		newChannel.shutdownNow();

		};
	
	}	


