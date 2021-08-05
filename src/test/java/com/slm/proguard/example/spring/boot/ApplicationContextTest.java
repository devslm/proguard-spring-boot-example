package com.slm.proguard.example.spring.boot;

import com.slm.proguard.example.spring.boot.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class ApplicationContextTest {
    @Autowired
    private ExampleService exampleService;

    @Test
    public void shouldStartContextSuccessfully() throws Exception {
        final int calculateResult = exampleService.calculate();
        final String objectMapperSerializeResult = exampleService.serializeObjectToString();

        assertThat(calculateResult, is(200));
        assertThat(objectMapperSerializeResult, is("{\"variableString\":\"Test String\",\"variableInt\":20,\"variableObject\":{}}"));
    }
}
