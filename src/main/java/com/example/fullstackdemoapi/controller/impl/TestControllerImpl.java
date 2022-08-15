package com.example.fullstackdemoapi.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestControllerImpl {

    @GetMapping
    public String test() {
        return "It works";
    }

}
