package com.example;

import com.example.model.Greeting;
import com.example.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class HelloFunction {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloFunction.class, args);
    }

    @Bean("hello")
    public Function<User, Greeting> hello() {
    	System.out.println("TEST");
        return user -> new Greeting("Hello! Welcome, " + user.getName());
    }

    @Bean("hi")
    public Function<User, Greeting> hi() {
        return user -> new Greeting("Hi! Welcome, " + user.getName());
    }
}
