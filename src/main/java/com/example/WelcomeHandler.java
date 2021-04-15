package com.example;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import com.example.model.User;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

public class WelcomeHandler  extends AzureSpringBootRequestHandler<String,String> {
	

    @FunctionName("welcomeMsg")
    public HttpResponseMessage execute(@HttpTrigger(name = "request", methods = { HttpMethod.GET,
            HttpMethod.POST }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<User>> request,
            ExecutionContext context) {
    	System.out.println("function call 2"); 
        context.getLogger().info("Greeting user name: " + request.getBody().get().getName());
        return request.createResponseBuilder(HttpStatus.OK).body(handleRequest(request.getQueryParameters().get("Body"),context)).header("Content-Type","text/plain").build();
    }
}