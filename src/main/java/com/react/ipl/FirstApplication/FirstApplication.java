package com.react.ipl.FirstApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({ "com.react.ipl.model"})
@EnableJpaRepositories(basePackages="com.react.ipl.repository")
@ComponentScan({ "com.react.ipl.entity", "com.react.ipl.configuration","com.react.ipl.model","com.react.ipl.controller" })
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
	
}
