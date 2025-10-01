package com.example.identity_service.controllers;

import com.example.identity_service.entities.Hello;
import com.example.identity_service.repository.HelloRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final HelloRepository helloRepository;

    public HelloController(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @GetMapping("/hello")
    public List<Hello> getAllHello() {
        return helloRepository.findAll();
    }

    @GetMapping("/hello/Alice")
    public String hello() {
        return "Hello from Alice";
    }
}

