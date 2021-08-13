package com.example.cloudgatewayserviceeurekajavaconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayServiceEurekaJavaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayServiceEurekaJavaConfigApplication.class, args);
	}

}
