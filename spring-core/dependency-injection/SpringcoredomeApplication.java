package com.luv2code.springcoredome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.luv2code.springcoredome",
		                    "com.luv2code.util"
		})
public class SpringcoredomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredomeApplication.class, args);
	}

}
