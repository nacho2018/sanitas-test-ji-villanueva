package com.javatpoint.microservices.netflixzuulapigatewayserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class NetflixZuulApiGatewayServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
	}
	
	
	@Bean  
	//creating a sampler called   
	public Sampler defaultSampler()  {  
		return Sampler.ALWAYS_SAMPLE; //for traceId generation, keep this value for version 2.2.1
	}  
	  
}
