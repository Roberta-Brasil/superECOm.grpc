package ds.Service2;

//Importing from grpc libraries

import java.io.IOException;


import ds.Service2.service2Grpc.service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import simpleMDNS.SimpleServiceRegistration1;

	//Skeleton for our Server_Service2

    //Extend class for own implementation 
	 public class Server_Service2 extends service2ImplBase {
		
	//Main method and thows exception	
		public static void main(String[] args) throws IOException, InterruptedException {
		
						
	//having an object of the class and using the JMDNS and methods
			
			Server_Service2 serverService2 = new Server_Service2();	

			System.out.println("Starting gRPC Server");
			int port = 50052;
			String service_type = "_grpc._tcp.local.";
			String service_name = "service2Grpc";
			SimpleServiceRegistration1 ssr = new SimpleServiceRegistration1();
			ssr.run(port, service_type, service_name);
			
			System.out.println("Port: " + port);
			
	//The builder Pattern - this is an instance variable that containing the server	
			Server server = ServerBuilder.forPort(port)
					.addService(serverService2)
					.build()
					.start();

			System.out.println("Service started, listening on " + port);
			
	//To guarantee that the server will keep running 
			server.awaitTermination();

		}
		
			  
	// Below I implemented each method for Service2.proto
		  
		  
	//Client Streaming - Method:requestPeriod, request:periodRequested,response:identifyPeriod.
		
		@Override	  
		  public StreamObserver<periodRequested> requestPeriod(StreamObserver<identifyPeriod> responseObserver ){
			  System.out.println(" On Server: inside the client streaming method");
			  return  new StreamObserver<periodRequested>() {

				@Override
				public void onNext(periodRequested request) {
					System.out.println(" On Server" + request.getStartDate() + request.getEndDate());
					
				}

				
				@Override
				public void onCompleted() {
										  					
					// Now build up our response for client Streaming
					
		            responseObserver.onNext(identifyPeriod.newBuilder()
		            	.setPeriodMsg("The period requested to consult Water/Air polluition was : 2021-05-06 to 2021-08-06").build());
		            responseObserver.onCompleted();
		        }

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

		    };
		}
		  
			  
	//Unary - Method: enterNaturalResourcetype, request:resourseType,response:registrationTypeResponse
		
      @Override
				
    	    	  
		//Find out what the content of the message sent by the client
        public void enterNaturalResourcetype(resourceType request, StreamObserver<registrationTypeResponse> responseObserver) {
		
		System.out.println(request.getMyResourceType());
		
		//Now building up our response and the message
		 registrationTypeResponse reply = registrationTypeResponse.newBuilder().setNaturalResourceRegistered("The Natural resource type was resgistered sucessfully " + request.getMyResourceType()).build();

        
		responseObserver.onNext( reply ); 
		
		//to the client knows I finished the messages

		responseObserver.onCompleted();
		
      }
	
    //Server Streaming - method: returnAirQualitybyPeriod, request: identifyPeriod, response: reportAirWaterQuality
 

	@Override

	public void returnAirQualitybyPeriod(identifyPeriod request, StreamObserver<reportAirWaterQuality> responseObserver){

	//Find out what the content of the message sent by the client
	String periodMsg = request.getPeriodMsg();
	System.out.println(periodMsg);


	//Now build up our response

	reportAirWaterQuality.Builder responseBuilder = reportAirWaterQuality.newBuilder();

	//First message
	responseBuilder.setPeriodMsg("Server streaming: The Period requested to consult Air/Water quality is from 2021-05-06 to 2021-08-06");
	responseObserver.onNext(responseBuilder.build());


	//Second message

	//String myResourceType = "The Station find is " + dataCityInfo;
	responseBuilder.setMyResourceType("The Natural resource type Water was sucessfully registered");
	responseObserver.onNext(responseBuilder.build());

	//Later messages
	String qualityReport = (" On the city requested above, we have relevant some water/Air samples of sulphur dioxide, "
	                    + "carbon dioxide and oxides on the air and water"); 


	responseBuilder.setQualityReport("Server Streaming : Here is you report " + qualityReport);
	responseObserver.onNext(responseBuilder.build());

	//to the client knows I finished the messages
	responseObserver.onCompleted();

	}


	};

		
	
     