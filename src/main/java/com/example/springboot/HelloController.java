package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greeting() {
        return "Welcome to the Spring Boot Application! Click here to go to the <a href='/index.html'>Main page</a>." +
                "Test for Fred";
    }

}