package com.complete.store.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@EnableConfigServer
@EnableEurekaServer
@SpringBootApplication
public class CompleteDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompleteDemoApplication.class, args);
	}

	@Bean
	public String subString(){
		return "bean";
	}
}

