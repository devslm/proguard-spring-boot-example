package com.slm.proguard.example.spring.boot.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (c) 2021 SLM Dev <https://github.com/devslm/proguard-spring-boot-example/>. All rights reserved.
 */
@Configuration
public class BeanConfig {
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
