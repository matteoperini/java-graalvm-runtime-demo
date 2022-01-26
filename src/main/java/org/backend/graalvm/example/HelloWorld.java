package org.backend.graalvm.example;

import java.util.Optional;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.printf("Hello: %s\n", Optional.of(args.length).filter(i -> i > 0).map(i -> args[0]).orElse("World!"));
    }

    private void getInvocation() {
        String runtimeApiEndpoint = System.getenv("AWS_LAMBDA_RUNTIME_API");
        // calling next API
    }

    private void executeHandlerAndPostResult() {
        String runtimeApiEndpoint = System.getenv("AWS_LAMBDA_RUNTIME_API");
        try {
            // calling response API
        } catch (Exception e) {
            // calling error API
        }
    }
}
