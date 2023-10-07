package dev.karl.k8sapp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public Message hello(){
        return new Message("Hello, World!");
    }

}
