package com.madushan.springdatajpa;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpa {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringDataJpa.class, args);
    }

    CommandLineRunner commandLineRunner() {
        return args -> {

        };
    }
}
