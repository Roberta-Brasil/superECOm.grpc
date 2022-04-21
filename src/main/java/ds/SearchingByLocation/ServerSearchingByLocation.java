package ds.SearchingByLocation;

import java.io.IOException;

import ds.SearchingByLocation.searchingByLocationGrpc.searchingByLocationImplBase;
//Importing from grpc libraries
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


//Skeleton for our server

public class ServerSearchingByLocation{
	
//this is an instance variable that containing the server	
	private Server searchinglocation;
	
//Main method	
	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		
// having an object of the class	
	
		ServerSearchingByLocation serverService1 = new ServerSearchingByLocation();	
		serverService1. start();
	}

private void start() throws IOException  {
	System.out.println("Starting gRPC Server");
	int port = 50051;
	
	//The builder Pattern
	searchinglocation = ServerBuilder.forPort(port).addService(new SearchingByLocationImpl()).build().start();
}

//Extend abstract base class for our own implementation
  static class SearchingByLocationImpl extends searchingByLocationImplBase{
	  
	//implementing method for client streaming
    // As this is the Server class we are going to get a stream of messages coming in from the client
	// for this incoming message we need to implement a Streamobserver
	// and them we pass it back to the GRPC library
	 
 }
}
	 
	