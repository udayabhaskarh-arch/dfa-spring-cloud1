package com.example;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Welcome {
	
	@Autowired
	FDSConfigServices fDSConfigServices;

	
	@Bean
	public Function<String,String> welcomeMsg() {
		System.out.println("Bean endpoint call 1"); 
		System.out.println("recordds:: -->>>"+  fDSConfigServices.getRecord());
		return String::toUpperCase;
	}
}
