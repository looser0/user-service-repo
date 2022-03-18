package com.cardekho.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={HibernateJpaAutoConfiguration.class})
@EnableDiscoveryClient
@EnableAutoConfiguration
@EntityScan(basePackages = "com.cardekho.userservice.model")
@ComponentScan(basePackages = {"com.cardekho.userservice","com.cardekho.userservice.repository"})
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
