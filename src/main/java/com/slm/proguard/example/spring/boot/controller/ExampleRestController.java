package com.slm.proguard.example.spring.boot.controller;

import com.slm.proguard.example.spring.boot.service.ExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2021 SLM Dev <https://github.com/devslm/proguard-spring-boot-example/>. All rights reserved.
 */
@Slf4j
@RestController
@RequestMapping("/example")
@RequiredArgsConstructor
public class ExampleRestController {
    private final ExampleService exampleService;

    @GetMapping
    public String get() throws Exception {
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

        return "Ok";
    }
}
