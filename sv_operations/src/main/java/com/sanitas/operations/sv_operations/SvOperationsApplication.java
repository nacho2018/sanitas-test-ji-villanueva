package com.sanitas.operations.sv_operations;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.sanitas.operations.sv_operations.controllers",
		"com.sanitas.operations.sv_operations.services",
		"com.sanitas.operations.sv_operations.components"})
public class SvOperationsApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SvOperationsApplication.class, args);
		
	}

}
