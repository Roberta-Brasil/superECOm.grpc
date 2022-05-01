package ds.Service3;

//Importing from grpc libraries
	import java.io.IOException;

import ds.Service1.verifyStationRequested;
import ds.Service1.waterAirQuality;
import ds.Service2.Server_Service2;
import ds.Service2.service2Grpc.service2ImplBase;
import ds.Service3.service3Grpc.service3ImplBase;
import io.grpc.Server;
	import io.grpc.ServerBuilder;
	import io.grpc.stub.StreamObserver;
import simpleMDNS.SimpleServiceRegistration1;


	//Skeleton for our server
    //Extend class for own implementation 

	public class Server_Service3 extends service3ImplBase {
		
         //Main method and thows exception	
	     public static void main(String[] args) throws IOException, InterruptedException {
	
					
//having an object of the class and using the JMDNS and methods
		
		Server_Service3 serverService3 = new Server_Service3();	

		System.out.println("Starting gRPC Server");
		int port = 50051;
		String service_type = "_grpc._tcp.local.";
		String service_name = "service3Grpc";
		SimpleServiceRegistration1 ssr = new SimpleServiceRegistration1();
		ssr.run(port, service_type, service_name);
		
		System.out.println("Port: " + port);
		
//The builder Pattern - this is an instance variable that containing the server	
		Server server = ServerBuilder.forPort(port)
				.addService(serverService3)
				.build()
				.start();

		System.out.println("Service started, listening on " + port);
		
//To guarantee that the server will keep running 
		server.awaitTermination();

	}
			  
// Below I implemented each method for Service3.proto
			  
		//Server Streaming - method: enterLocation, request: enterCity, response: displayLocationDetails.
		  

@Override

public void enterLocation(enterCity request, StreamObserver<displayLocationDetails> responseObserver){

           //Find out what the content of the message sent by the client
            String cityAdded = request.getCityAdded();
            System.out.println(cityAdded);


  //Now build up our response

       displayLocationDetails.Builder responseBuilder = displayLocationDetails.newBuilder();

   //First message
       responseBuilder.setCityAdded("Server streaming: The City added is Paris");
       responseObserver.onNext(responseBuilder.build());


    //Second message
       responseBuilder.setCityDetails("The details of the city entered are: Montmartre - Paris - France");
       responseObserver.onNext(responseBuilder.build());

    //Later messages

      responseBuilder.setLocationConfirmationt(true);
      responseObserver.onNext(responseBuilder.build());

    //to the client knows I finished the messages
      responseObserver.onCompleted();

}
		  	  
		//Bidirectional Streaming - method:addingDetails, request: stream addInfo, response: responseAddInfo.
		  
@Override

public StreamObserver<addInfo> checkingMonitoringStations(StreamObserver<verifyStationRequested> responseObserver) {
	return new StreamObserver<addInfo>() {
        int count;
        
        @Override
        public void onNext(addInfo rq) {
                count++;
                System.out.println(rq.getNaturalResourceId());
                System.out.println(rq.getWind());
                System.out.println(rq.getTemperature());
                System.out.println(rq.getTypeOfnaturalDisaster());
                System.out.println(rq.getTypeOfPollutan());
            
            for (int i = 0; i < 3; i++) {
    	    	    responseAddInfo rm0 = responseAddInfo.newBuilder().setResourcesMessageConfirmation("Server message: The city added is: " + i).build();
                    responseAddInfo rm1 = responseAddInfo.newBuilder().setLastAddedMsg("Server message: Checking station..." + i).build();
                    responseAddInfo rm2 = responseAddInfo.newBuilder().setNaturalResourceLastAdded("Server message: Thanks for you contribution. the information was added sucssefully" + i).build();

    	    	try {
    				Thread.sleep(1500);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    	    	
    	    	responseObserver.onNext(null);
    	    	//responseObserver.onNext(rm);
    	    }
            
        }

        @Override
        public void onCompleted() {
            responseObserver.onCompleted();
        }

		@Override
		public void onError(Throwable t) {
			// TODO Auto-generated method stub
			
		}

    };
}
		  

		//Server Streaming - method: displayRecorded, request: selectViewInfo, response: responseDataRecorded.
		  			  	
     @Override

          public void displayRecorded(selectViewInfo request, StreamObserver<responseDataRecorded> responseObserver){

          //Find out what the content of the message sent by the client
           String viewInfoRegistered  = request.getViewInfoRegistered ();
           System.out.println(viewInfoRegistered );


          //Now build up our response

          responseDataRecorded.Builder responseBuilder = responseDataRecorded.newBuilder();

         //First message
          responseBuilder.setDisplayDataRecorded("Server streaming: The last added data recorded was : ");
          responseObserver.onNext(responseBuilder.build());


        //Second message
          responseBuilder.setCityDetails("The details of the city entered are: Montmartre - Paris - France");
          responseObserver.onNext(responseBuilder.build());

        //Later messages

          responseBuilder.setNaturalResourceLastAdded("Server streaming: On the city requested above, we have relevant some water/Air samples of sulphur dioxide, "
	            			                    + "carbon dioxide and oxides on the air and water");
          responseObserver.onNext(responseBuilder.build());

     //to the client knows I finished the messages
      responseObserver.onCompleted();

}


};

