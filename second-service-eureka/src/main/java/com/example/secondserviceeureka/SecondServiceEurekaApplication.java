package com.example.secondserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondServiceEurekaApplication.class, args);
	}

}
