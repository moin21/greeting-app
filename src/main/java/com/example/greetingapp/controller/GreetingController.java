package com.example.greetingapp.controller;

import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest Controller Class: GreetingController.
 */
@RestController
public class GreetingController {
    /**
     * GreetingService object: greetingService.
     */
    @Autowired
    GreetingService greetingService;

    /**
     * Method for Get request using dependency injection: sayHello.
     * URL: /hello
     *
     * @return - greetingService.sayHello
     */
    @GetMapping("/hello")
    public String sayHello() {
        return greetingService.sayHello();
    }


}
