package ds.Client;


import java.util.concurrent.TimeUnit;

import ds.Service2.resourseType;
import ds.Service2.service2Grpc;
import ds.Service2.service2Grpc.service2BlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class Client_Service2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Build a channel - connects the client to the server
		
		//specify the server and the port
		int port = 50051;
		String host = "localhost";
		
		//Generic code is generic
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		//ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();	
		//service1Grpc.service1Stub stub = service1Grpc.newStub(channel);
		
		//Now build a message 
		
		resourseType myResourseType = resourseType.newBuilder().setMyResourseType("Water").build();
		
		//Creating a blocking stub, pass the channel to the stub 
		//The stub is specific to the service
		//The stub is a local representation of our remote object(service)
		
		service2BlockingStub bstub = service2Grpc.newBlockingStub(newChannel);
		
		resourseType response = bstub.getEnterNaturalResourcetype(myResourseType); //passing over my request
		
		System.out.println(response.getMyResourseType());
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		
		
	}
}