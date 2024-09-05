package com.example.airline;

import com.example.airline.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.airline.repositories")
@EntityScan("com.example.airline")
@SpringBootApplication(scanBasePackages = { "com.example.airline" })
public class AirlineApplication {

	private static final Logger logger = LoggerFactory.getLogger(AirlineApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AirlineApplication.class, args);
	}

}
