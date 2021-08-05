package com.slm.proguard.example.spring.boot;

import com.slm.proguard.example.spring.boot.service.ExampleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * Created by seregaSLM on 07.07.2017.
 */
@Slf4j
@AllArgsConstructor
@SpringBootApplication
public class Application {
    private final ExampleService exampleService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void testOutput() throws Exception {
        LOGGER.info("#");
        LOGGER.info("###");
        LOGGER.info("##################################### Test Output ##################################");
        LOGGER.info("{}", exampleService.calculate());
        LOGGER.info("####################################################################################");
        LOGGER.info("###");
        LOGGER.info("#");

        LOGGER.info("#");
        LOGGER.info("###");
        LOGGER.info("############################## Test Output Object Mapper ###########################");
        LOGGER.info("{}", exampleService.serializeObjectToString());
        LOGGER.info("####################################################################################");
        LOGGER.info("###");
        LOGGER.info("#");
    }
}