package com.slm.proguard.example.spring.boot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * Copyright (c) 2021 SLM Dev <https://github.com/devslm/proguard-spring-boot-example/>. All rights reserved.
 *
 * Without {@code @JsonProperty} we see only obfuscated random names in JSON,
 * so we should annotate all DTO classes that will be serialized.
 */
@Data
@Accessors(chain = true)
public class ExampleObjectMapperDto {
    @JsonProperty("variableString")
    private String variableString;
    @JsonProperty("variableInt")
    private int variableInt;
    @JsonProperty("variableObject")
    private Object variableObject;
}