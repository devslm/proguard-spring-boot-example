package com.slm.proguard.example.spring.boot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by seregaSLM on 17.07.2020.
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