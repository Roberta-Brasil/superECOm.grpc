package ds.Service3;

//Importing from grpc libraries
	import java.io.IOException;

import ds.Service3.service3Grpc.service3ImplBase;
import io.grpc.Server;
	import io.grpc.ServerBuilder;
	import io.grpc.stub.StreamObserver;


	//Skeleton for our server

	public class Server_Service3 {
		
	//this is an instance variable that containing the server	
		private Server service3var;
		
	//Main method	
		public static void main(String[] args) throws IOException {
		
			// TODO Auto-generated method stub
			
	// having an object of the class	
		
			Server_Service3 serverService3 = new Server_Service3();	
			serverService3. start();
		}

	private void start() throws IOException  {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		
		//The builder Pattern
		service3var = ServerBuilder.forPort(port).addService(new Service3Impl()).build().start();
	}

	//Extend abstract base class for our own implementation
	  static class Service3Impl extends service3ImplBase{
		  
		// Below I implemented each method for Service3.proto	
		  
		  
		//Server Streaming - method: enterLocation, request: enterCity, response: displayLocationDetails.
		  
		  
		//Bidirectional Streaming - method:addingDetails, request: stream addInfo, response: responseAddInfo.
		  
		  
		//Server Streaming - method: displayRecorded, request: selectViewInfo, response: responseDataRecorded.
		  

	}

}
