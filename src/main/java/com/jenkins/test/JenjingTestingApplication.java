package com.jenkins.test;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenjingTestingApplication {
	private static final Logger logger = LoggerFactory.getLogger(JenjingTestingApplication.class);

	@PostConstruct
	public void init() {
		logger.info("This in init method...");
	}

	public static void init() {
		logger.info("This in init method...");
	}
	public static void main(String[] args) {
		logger.info("main executing");
		SpringApplication.run(JenjingTestingApplication.class, args);
		logger.info("main executed");
	}

}
