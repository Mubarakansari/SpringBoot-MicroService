package com.springapigatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringapigatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapigatwayApplication.class, args);
		System.out.println("===========Api gateway application started=============");
	}

}
