package ds.Service2;

//Importing from grpc libraries

	import java.io.IOException;
    import ds.Service2.service2Grpc.service2ImplBase;
	import io.grpc.Server;
	import io.grpc.ServerBuilder;
	import io.grpc.stub.StreamObserver;


	//Skeleton for our server

	public class Server_Service2 {
		
	//this is an instance variable that containing the server	
		private Server service2var;
		
	//Main method	
		public static void main(String[] args) throws IOException, InterruptedException {
		
			// TODO Auto-generated method stub
			
	// having an object of the class and using the start method
		
			Server_Service2 serverService2 = new Server_Service2();	
			serverService2. start();
		}

	private void start() throws IOException, InterruptedException  {
		System.out.println("Starting gRPC Server");
		int port = 50052;
		
		//The builder Pattern
		service2var = ServerBuilder.forPort(port).addService(new Service2Impl()).build().start();
		System.out.println("Server running on port " + port);
		
		//To guarantee that the server will keep running until 
		
		service2var.awaitTermination();
		
	}

	//Extend abstract base class for our own implementation
	  static class Service2Impl extends service2ImplBase{
		  
	// Below I implemented each method for Service2.proto
		  
	//Client Streaming - Method:requestPeriod, request:periodRequested,response:identifyPeriod.
		  
		  
	//Unary - Method: enterNaturalResourcetype, request:resourseType,response:registrationTypeResponse
		
      @Override
		  
	   public void getEnterNaturalResourcetype(resourseType request, StreamObserver<registrationTypeResponse> responseObserver){
		
		//Find out what the content of the message sent by the client
		String myResourseType = request.getEnterNaturalResourcetype();
		System.out.println("Please enter the Natural Resource type? ");
		System.out.println("It cannot be anything different from Water or Air quality or Both" + myResourseType );
	
	   //Now build up our response
		
		registrationTypeResponse.Builder responseBuilder = registrationTypeResponse.newBuilder();
		
		responseBuilder.setEnterNaturalResourcetype("Natural Resources type registered is "+ myResourseType);
		
		//Build the message 
		responseObserver.onNext(responseBuilder.build());
		
		responseObserver.onCompleted();
	}
	  }
	}
    //Server Streaming - method: returnAirQualitybyPeriod, request: identifyPeriod, response: reportAirWaterQuality
   
     