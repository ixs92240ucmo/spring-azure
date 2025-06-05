package com.springapp.spring_azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureApplication {
	@GetMapping("/api1")
	public String api1() {
		return "This is API 1";
	}
	@GetMapping("/api2")
	public String api2() {
		return "This is API 2";
	}
	@GetMapping("/api3")
	public String api3() {
		return "This is API 3";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringAzureApplication.class, args);
	}

}
