package com.springcamel.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude =HibernateJpaAutoConfiguration.class)
@ComponentScan
public class SpringcamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcamelApplication.class, args);
	}

}
