package com.demoproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringBootDemoprojApplication {

	@GetMapping("/hi")
	public String home() {
		return "Welcome to Azure platform spring boot project" ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoprojApplication.class, args);
	}

}
