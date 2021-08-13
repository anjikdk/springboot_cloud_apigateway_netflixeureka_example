package com.example.firstserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstServiceEurekaApplication.class, args);
	}

}
