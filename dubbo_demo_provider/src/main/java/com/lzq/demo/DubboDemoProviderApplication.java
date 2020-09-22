package com.lzq.demo;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboDemoProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboDemoProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
