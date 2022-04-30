package ds.Client;


import java.util.Iterator;
import ds.Service3.displayLocationDetails;
import ds.Service3.enterCity;
import ds.Service3.responseDataRecorded;
import ds.Service3.selectViewInfo;
import ds.Service3.service3Grpc;
import ds.Service3.service3Grpc.service3BlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


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
			
		// TODO Auto-generated method stub
		
		
     //Server Streaming - method: enterLocation, request: enterCity, response: displayLocationDetails.
		
				
				enterCity request = enterCity.newBuilder().setCityAdded("Please enter your City").build();	
				
				
				Iterator<displayLocationDetails> responses = stubB.enterLocation(request);
				while (responses.hasNext()) {
					displayLocationDetails rm = responses.next();
					System.out.println(String.valueOf( rm.getCityAdded()));
			        System.out.println(String.valueOf( rm.getLocationConfirmation()));
			        
				};
				//nChannel.shutdownNow();
		
		//Server Streaming  - method:displayRecorded, request: selectViewInfo, response: responseDataRecorded.
		  
				
				selectViewInfo request1 = selectViewInfo.newBuilder().setViewInfoRegistered("The Info registered was: ").build();	
				
				
				Iterator<responseDataRecorded> responses1 = stubB.displayRecorded(request1);
				
				while (responses.hasNext()) {
					responseDataRecorded rm = responses1.next();
					System.out.println(String.valueOf( rm.getDisplayDataRecorded()));
			                System.out.println(String.valueOf( rm.getCityDetails()));
			                System.out.println(String.valueOf( rm.getNaturalResourceLastAdded()));
				}
				channel.shutdownNow();

				};
		
				
				
	};
