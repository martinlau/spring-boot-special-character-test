package com.github.martinlau.springBoot.specialCharacter.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(final String... args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
