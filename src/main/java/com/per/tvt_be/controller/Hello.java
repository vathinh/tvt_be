package com.per.tvt_be.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping
    public String helloWorld() {
        return "Hello from Spring Boot";
    }
}
