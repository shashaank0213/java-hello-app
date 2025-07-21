package com.example.HelloApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloAppApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Jenkins-deployed Java App!";
    }
}
