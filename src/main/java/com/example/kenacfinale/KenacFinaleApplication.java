package com.example.kenacfinale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class KenacFinaleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KenacFinaleApplication.class, args);
    }

}
