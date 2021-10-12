package com.slm.proguard.example.spring.boot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.slm.proguard.example.spring.boot.dto.ExampleDto;
import com.slm.proguard.example.spring.boot.dto.ExampleObjectMapperDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * Copyright (c) 2021 SLM Dev <https://github.com/devslm/proguard-spring-boot-example/>. All rights reserved.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ExampleService {
    private final ObjectMapper objectMapper;

    private final ExampleDto exampleDto = ExampleDto.builder()
        .variableInt(20)
        .variableString("Test String")
        .variableObject(new HashMap<>())
        .build();

    public int calculate() {
        return exampleDto.getVariableInt() * 10;
    }

    public String serializeObjectToString() throws Exception {
        final ExampleObjectMapperDto exampleObjectMapper = new ExampleObjectMapperDto()
            .setVariableInt(20)
            .setVariableString("Test String")
            .setVariableObject(new HashMap<>());

        return objectMapper.writeValueAsString(exampleObjectMapper);
    }
}
