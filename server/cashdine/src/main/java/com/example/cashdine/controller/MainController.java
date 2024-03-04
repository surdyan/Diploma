package com.example.cashdine.controller;

import com.example.cashdine.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return restaurantService.getAllRestaurants();
    }
}
