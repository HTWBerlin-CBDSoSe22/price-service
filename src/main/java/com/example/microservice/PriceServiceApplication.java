package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriceServiceApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(PriceServiceApplication.class, args).close();
	}

}
