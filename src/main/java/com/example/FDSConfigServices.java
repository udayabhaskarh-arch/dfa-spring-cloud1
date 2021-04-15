package com.example;

import org.springframework.stereotype.Service;

@Service
public class FDSConfigServices {

	public String getRecord() {
		
		for(int i=0;i< 5; i++) {
			System.out.println("i index-->>" +i);
		}
		return "service";
	}
	
	
}
