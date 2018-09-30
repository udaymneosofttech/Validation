package com.nt.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nt.projectclasses.MobileConfiguration;

@SpringBootApplication
@Import(MobileConfiguration.class)

public class MobileStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileStoreApplication.class, args);
	}
}
