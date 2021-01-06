package com.fastcode.testdvdsample5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.fastcode.testdvdsample5", "org.springframework.versions" })
public class Testdvdsample5Application {

    public static void main(String[] args) {
        SpringApplication.run(Testdvdsample5Application.class, args);
    }
}
