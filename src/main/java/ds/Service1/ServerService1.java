package ds.Service1;

//Importing from grpc libraries

import java.io.IOException;

import ds.Service1.service1Grpc.service1ImplBase;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;



//Skeleton for our server

public class ServerService1{
	
//this is an instance variable that containing the server	
	private Server service1var;
	
//Main method	
	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		
// having an object of the class	
	
		ServerService1 serverService1 = new ServerService1();	
		serverService1. start();
	}

private void start() throws IOException  {
	System.out.println("Starting gRPC Server");
	int port = 50051;
	
	//The builder Pattern
	service1var = ServerBuilder.forPort(port).addService((BindableService) new Service1Impl()).build().start();
}

//Extend abstract base class for our own implementation
  static class Service1Impl extends service1ImplBase{
	  
	//implementing method for client streaming
    // As this is the Server class we are going to get a stream of messages coming in from the client
	// for this incoming message we need to implement a Streamobserver
	// and them we pass it back to the GRPC library
	 
 }
}
	 
	