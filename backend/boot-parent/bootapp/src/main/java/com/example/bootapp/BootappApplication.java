package com.example.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class BootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}

}
