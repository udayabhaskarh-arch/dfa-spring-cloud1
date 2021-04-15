package com.example.dfsspringcloud1;

import java.util.UUID;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DfsSpringCloud1Application {

	public static void main(String[] args) {
		SpringApplication.run(DfsSpringCloud1Application.class, args);
	}

	@Bean
	public Supplier<String> randomString() {
	  return () -> UUID.randomUUID().toString();
	}
}
