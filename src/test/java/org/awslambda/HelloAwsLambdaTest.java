package org.awslambda;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloAwsLambdaTest {

    @Test
    public void shouldReturnHelloMessage() {
        var result =new HelloAwsLambda();
        Assertions.assertEquals("Hello, AWS Lambda World!",result.handleRequest());
    }
}