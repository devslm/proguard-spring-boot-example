package com.slm.proguard.example.spring.boot.service;

import com.slm.proguard.example.spring.boot.dto.ExampleDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by seregaSLM on 07.07.2017.
 */
@Slf4j
@Service
public class ExampleService {
    private ExampleDto exampleDto;

    public ExampleService() {
        this.exampleDto = ExampleDto.builder()
            .variableInt(20)
            .variableString("Test String")
            .variableObject(new Object())
            .build();
    }

    public int calculate() {
        return exampleDto.getVariableInt() * 10;
    }
}