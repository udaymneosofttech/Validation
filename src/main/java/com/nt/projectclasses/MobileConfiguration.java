package com.nt.projectclasses;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration

@ComponentScan("com.nt.projectclasses")
@EnableTransactionManagement
@EnableJpaRepositories("com.nt.projectclasses")
@EntityScan("com.nt.projectclasses")
public class MobileConfiguration {
	

}
