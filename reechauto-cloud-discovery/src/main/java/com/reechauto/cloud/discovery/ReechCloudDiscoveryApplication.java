package com.reechauto.cloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReechCloudDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReechCloudDiscoveryApplication.class, args);
	}

}

