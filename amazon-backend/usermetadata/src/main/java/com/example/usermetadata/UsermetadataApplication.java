package com.example.usermetadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.usermetadata.Entity")
public class UsermetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermetadataApplication.class, args);
	}

}
