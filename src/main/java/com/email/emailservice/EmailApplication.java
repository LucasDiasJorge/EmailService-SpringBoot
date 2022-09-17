package com.email.emailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {

		System.out.println("Starting ...");
		SpringApplication.run(EmailApplication.class, args);
		System.out.println("... use");

	}

}
