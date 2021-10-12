package com.slm.proguard.example.spring.boot.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Copyright (c) 2021 SLM Dev <https://github.com/devslm/proguard-spring-boot-example/>. All rights reserved.
 */
@Data
@Builder
public class ExampleDto {
    private String variableString;
    private int variableInt;
    private Object variableObject;
}