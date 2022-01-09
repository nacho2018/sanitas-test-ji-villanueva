package com.sanitas.operations.sv_operations;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.sanitas.operations.sv_operations.controllers",
		"com.sanitas.operations.sv_operations.services",
		"com.sanitas.operations.sv_operations.components",
		"com.sanitas.operations.sv_operations.logging"})
public class SvOperationsApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SvOperationsApplication.class, args);
		
	}
	
	@Bean  
	//creating a sampler called always sampler  for spring boot 2.2.1
	public Sampler defaultSampler()  {  
		return Sampler.ALWAYS_SAMPLE;  
	}  
	  

}
