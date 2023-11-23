package com.example.springboot_dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDocker1Application {

	@GetMapping("/message")
	public String getmessage() {
		return "Welcome to the Java World...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDocker1Application.class, args);
	}

}
