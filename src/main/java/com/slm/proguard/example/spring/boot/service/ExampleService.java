package com.slm.proguard.example.spring.boot.service;

import com.slm.proguard.example.spring.boot.domain.ExampleData;
import org.springframework.stereotype.Service;

/**
 * Created by seregaSLM on 07.07.2017.
 */
@Service
public class ExampleService {
    private ExampleData exampleData;

    public ExampleService() {
        this.exampleData = ExampleData.builder()
            .variableInt(20)
            .variableString("Test String")
            .variableObject(new Object())
            .build();
    }

    public int calculate() {
        return exampleData.getVariableInt() * 10;
    }
}