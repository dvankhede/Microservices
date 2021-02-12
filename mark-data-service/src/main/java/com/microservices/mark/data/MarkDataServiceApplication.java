package com.microservices.mark.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MarkDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarkDataServiceApplication.class, args);
	}

}
