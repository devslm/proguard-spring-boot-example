package com.slm.proguard.example.spring.boot;

import com.slm.proguard.example.spring.boot.service.ExampleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * Created by seregaSLM on 07.07.2017.
 */
@SpringBootApplication
public class Application {
    private final ExampleService exampleService;

    public Application(final ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void testOutput() {
        System.out.println("##################################### Test Output ##################################");
        System.out.println(exampleService.calculate());
        System.out.println("####################################################################################");
    }
}