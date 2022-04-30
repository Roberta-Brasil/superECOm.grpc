package ds.Service1;

import java.io.IOException;

import ds.Service1.service1Grpc.service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import simpleMDNS.SimpleServiceRegistration1;

//Skeleton for the Server_Service1

//Extend class for own implementation 
public class Server_Service1 extends service1ImplBase{

	//Main method and thows exception
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// having an object of the class
		Server_Service1 serverService1 = new Server_Service1();	

		System.out.println("Starting gRPC Server");
		int port = 50051;
		String service_type = "_grpc._tcp.local.";
		String service_name = "service1Grpc";
		SimpleServiceRegistration1 ssr = new SimpleServiceRegistration1();
		ssr.run(port, service_type, service_name);
		
		System.out.println("Port: " + port);
		
		////The builder Pattern - this is an instance variable that containing the server	
		Server server = ServerBuilder.forPort(port)
				.addService(serverService1)
				.build()
				.start();

		System.out.println("Service started, listening on " + port);

		server.awaitTermination();

	}
	
	//Below I implemented each method for Service1.proto
	  
	
    //Client streaming - method: displayLocation, request: enterLocation, response:displayCityInfo
	
	@Override
	public StreamObserver<enterLocation> displayLocation(StreamObserver<displayCityInfo> responseObserver) {
		System.out.println("Please enter your current City: ");
		return new StreamObserver<enterLocation>() {
	       

	        @Override
	        public void onNext(enterLocation request) {
	                System.out.println(request.getDataCityInfo());
	            
	        }

	        @Override
	        public void onCompleted() {
	        	
	        	// Now build up our response	        	
	            responseObserver.onNext(displayCityInfo.newBuilder()
	            	.setDataCityInfo("Dublin is your current Location")	
	                .setEmptyCityInput(false)
	                .setErrorMessage("Location not found")
	                .build());
	            responseObserver.onCompleted();
	        }

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

	    };
	    
		
	}

}

