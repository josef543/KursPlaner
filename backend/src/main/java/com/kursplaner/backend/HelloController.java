package com.kursplaner.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from backend";
    }

    // A very simple health/ping endpoint as well
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
