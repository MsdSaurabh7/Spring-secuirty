package com.example.securitydemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/hii")
    public String sayHii(){
        return "hello";
    }

    @GetMapping("/msd")
    public String sayMsd(){
        return "hello";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/csk")
    public String sayCsk(){
        return "hello";
    }
}
