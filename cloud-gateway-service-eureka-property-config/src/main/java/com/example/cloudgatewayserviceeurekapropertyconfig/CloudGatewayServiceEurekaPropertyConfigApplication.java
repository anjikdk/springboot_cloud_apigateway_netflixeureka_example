package com.example.cloudgatewayserviceeurekapropertyconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayServiceEurekaPropertyConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayServiceEurekaPropertyConfigApplication.class, args);
	}

}
