package com.biblioteca.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EntityScan(basePackages = { "com.biblioteca.entity" })
//@EnableJpaRepositories(basePackages = { "com.biblioteca.repository" })
@ComponentScan(basePackages = {"com.biblioteca.controller"})
public class Api {

    public static void main(String[] args) {
        SpringApplication.run(Api.class, args);
    }
    
}
