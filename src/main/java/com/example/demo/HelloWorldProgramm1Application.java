package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @SpringBootApplication Creating HelloWorldProgrammApplication which prints Hello from BridgeLabz
 *
 */
@SpringBootApplication
public class HelloWorldProgramm1Application {

	public static void main(String[] args) {
		System.out.println("Hello form BridgeLabz");
		SpringApplication.run(HelloWorldProgramm1Application.class, args);
	}

}
