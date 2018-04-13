package com.nd.social.eureka33;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka33Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka33Application.class, args);
	}
}
