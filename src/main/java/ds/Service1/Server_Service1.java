package ds.Service1;

//Importing from grpc libraries

import java.io.IOException;

import ds.Service1.service1Grpc.service1ImplBase;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;



//Skeleton for our server

public class Server_Service1{
	
//this is an instance variable that containing the server	
	private Server service1var;
	
//Main method	
	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		
// having an object of the class	
	
		Server_Service1 serverService1 = new Server_Service1();	
		serverService1. start();
	}

private void start() throws IOException  {
	System.out.println("Starting gRPC Server");
	int port = 50051;
	System.out.println("Port: " + port);
	
	
	
	//The builder Pattern
	service1var = ServerBuilder.forPort(port).addService((BindableService) new Service1Impl()).build().start();
}

//Extend abstract base class for our own implementation 

  static class Service1Impl extends service1ImplBase{
	  
	//Below I implemented each method for Service1.proto
	
	//Client streaming - method: displayLocation, request: enterLocation, response:displayCityInfo
	  
	  	  
	//implementing method for client streaming
    // As this is the Server class we are going to get a stream of messages coming in from the client
	// for this incoming message we need to implement a Streamobserver
	// and them we pass it back to the GRPC library
  	

		@Override
		public StreamObserver<enterLocation> displayLocation(StreamObserver<displayCityInfo> responseObserver) 
		{
			return new StreamObserver<enterLocation>()  
			{
		       		        
		       @Override
		        public void onNext(enterLocation request) {
		            
		            System.out.println(request.getDataCityInfo());
		               			    	    
		    	    }
		            
		        @Override
		        public void onError(Throwable t)
		        {
		       
		        }
		       
		        @Override
		        public void onCompleted()
		        {
		        // Now build up our response
		       // DisplayCityInfo.Builder responseBuilder = DisplayCityInfo.newBuilder();
		        
		        displayCityInfo.Builder responseBuilder = displayCityInfo.newBuilder(); 	
		        responseBuilder.setDataCityInfo("This is your current location");
		        
		        responseBuilder.setEmptyCityInput(false);
		        responseBuilder.setErrorMessage("Location not found");
		        
		        responseObserver.onNext(responseBuilder.build());
		        responseObserver.onCompleted();
		        
		        }
			};
		}

  }
}
	  
	  
  //Bidirectional Streaming - method: checkingMonitoringStations, request:scanCityEntered, response: verifyStationRequested){}	  
  
	  
	  
	  
 
	  
 //Server streaming - method: airQualityResponse, request:verifyStationRequested, response: waterAirQuality
	  
		
	

	