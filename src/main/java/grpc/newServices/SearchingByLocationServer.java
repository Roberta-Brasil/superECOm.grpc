package grpc.newServices;

//Importing from grpc libraries
import io.grpc.Server;
import io.grpc.ServerBuilder;

//Skeleton for our server

public class SearchingByLocationServer{
	
//this is an instance variable that containing the server	
	private Server searchingByLocationImpl;
	
//Main method	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
// having an object of the class	
	
		SearchingByLocationServer serverService1 = new SearchingByLocationServer();	
		serverService1. start();
	}

private void start() {
	System.out.println("Starting gRPC Server");
	int port = 50051;
	
	//The builder Pattern
	searchingByLocationImpl = ServerBuilder.forPort(port).addService(new searchingByLocationImpl()).build().start();
}

//Extend abstract basec class for our own implementation
  static class SearchingByLocationServer extends searchingByLocationImpl{

}
  }
