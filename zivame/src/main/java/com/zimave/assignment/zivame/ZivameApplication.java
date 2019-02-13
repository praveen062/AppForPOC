package com.zimave.assignment.zivame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class ZivameApplication {
	private static class Configuration extends AbstractApplicationConfiguration { }
	public static void main(String[] args) {
		SpringApplication.run(Configuration.class, args);
	}

}

