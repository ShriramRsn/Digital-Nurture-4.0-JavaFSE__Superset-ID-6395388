package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		System.out.println("Main method started...");
		LOGGER.info("STARTING THE APPLICATION");
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("APPLICATION STARTED SUCCESSFULLY");
	}

}
