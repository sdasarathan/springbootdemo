package com.das.springboot.springbootdemo;

import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

}
