package com.codecool.cloudrunbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootEndpoint {
    @GetMapping
    String get() {
        return "Why are you running?";
    }
}
