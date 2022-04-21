package ds.SearchingByPeriod;

	import java.io.IOException;
	import ds.SearchingByPeriod.searchingByPeriodGrpc.searchingByPeriodImplBase;
//Importing from grpc libraries
	import io.grpc.Server;
	import io.grpc.ServerBuilder;
	import io.grpc.stub.StreamObserver;


	//Skeleton for our server

	public class ServerSearchingByPeriod {
		
	//this is an instance variable that containing the server	
		private Server searchingPeriod;
		
	//Main method	
		public static void main(String[] args) throws IOException {
		
			// TODO Auto-generated method stub
			
	// having an object of the class	
		
			ServerSearchingByPeriod serverService2 = new ServerSearchingByPeriod();	
			serverService2. start();
		}

	private void start() throws IOException  {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		
		//The builder Pattern
		searchingPeriod = ServerBuilder.forPort(port).addService(new SearchingByPeriodImpl()).build().start();
	}

	//Extend abstract base class for our own implementation
	  static class SearchingByPeriodImpl extends searchingByPeriodImplBase{
		  
		// TODO Auto-generated method stub

	}

}
