package com.bbzz.datastandardsvalid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.bbzz.datastandardsvalid")
@EntityScan("com.bbzz.datastandardsvalid")
@ComponentScan(basePackages = {"com.bbzz.datastandardsvalid"})
public class DataStandardsValidApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataStandardsValidApplication.class, args);
	}

}
