package com.bhaskara.cpservice.cpservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpServiceApplication.class, args);
	}
}
