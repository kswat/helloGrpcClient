package com.sample.grpc;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloGrpcClientApplication {

	@Autowired
	SimpleGrpcClient simpleGrpcClient;
	public static void main(String[] args) {
		SpringApplication.run(HelloGrpcClientApplication.class, args);
	}

	@PostConstruct
	private void callGrpc() {
		simpleGrpcClient.helloClient("gRPC");
	}
}
