package ds.UserCollaboration;

	import java.io.IOException;
	import ds.SearchingByPeriod.searchingByPeriodGrpc.searchingByPeriodImplBase;
import ds.UserCollaboration.userCollaborationGrpc.userCollaborationImplBase;
//Importing from grpc libraries
	import io.grpc.Server;
	import io.grpc.ServerBuilder;
	import io.grpc.stub.StreamObserver;


	//Skeleton for our server

	public class ServerUserCollaboration {
		
	//this is an instance variable that containing the server	
		private Server userCollaboration;
		
	//Main method	
		public static void main(String[] args) throws IOException {
		
			// TODO Auto-generated method stub
			
	// having an object of the class	
		
			ServerUserCollaboration serverService3 = new ServerUserCollaboration();	
			serverService3. start();
		}

	private void start() throws IOException  {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		
		//The builder Pattern
		userCollaboration = ServerBuilder.forPort(port).addService(new UserCollaborationImpl()).build().start();
	}

	//Extend abstract base class for our own implementation
	  static class UserCollaborationImpl extends userCollaborationImplBase{
		  
		// TODO Auto-generated method stub

	}


}
