package com.bytewheels.application.configuration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.bytewheels.*"})
@EntityScan(basePackages = {"com.bytewheels.customer.dao","com.bytewheels.inventory.dao","com.bytewheels.order.dao"})
@EnableJpaRepositories(basePackages = {"com.bytewheels.order.repository", "com.bytewheels.customer.repository", "com.bytewheels.inventory.repository"})
@SpringBootApplication
public class ApplicationConfig {

    public static void main(String args[]){
        SpringApplication.run(ApplicationConfig.class, args);
    }
}
