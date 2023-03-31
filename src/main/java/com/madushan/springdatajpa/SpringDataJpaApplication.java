package com.madushan.springdatajpa;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    CommandLineRunner commandLineRunner() {
        return args -> {

        };
    }
}
