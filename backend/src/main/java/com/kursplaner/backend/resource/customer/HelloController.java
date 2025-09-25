package com.kursplaner.backend.resource.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/hello")
    public String hello() {
        Customer c = new Customer("John", "Doe");
        customerService.saveCustomer(c);

        return "Hello from backend";
    }

    // A very simple health/ping endpoint as well
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
