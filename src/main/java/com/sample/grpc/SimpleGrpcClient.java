package com.sample.grpc;

import com.sample.grpc.proto.HelloReply;
import com.sample.grpc.proto.HelloRequest;
import com.sample.grpc.proto.SimpleGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SimpleGrpcClient {
    @GrpcClient(value = "simpleService") //this is what was used in app props
    private SimpleGrpc.SimpleBlockingStub simpleBlockingStub;

    public void helloClient(String name){
        HelloRequest helloRequest = HelloRequest.newBuilder().setName(name).build();

        HelloReply helloReply = simpleBlockingStub.greeting(helloRequest);
        System.out.println(helloReply.getMessage());

    }

}
