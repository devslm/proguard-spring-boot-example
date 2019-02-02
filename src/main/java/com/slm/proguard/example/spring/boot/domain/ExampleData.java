package com.slm.proguard.example.spring.boot.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Created by seregaSLM on 07.07.2017.
 */
@Data
@Builder
public class ExampleData {
    private String variableString;
    private int variableInt;
    private Object variableObject;
}