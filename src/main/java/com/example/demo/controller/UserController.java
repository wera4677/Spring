package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/paid")
    public String getPaidUser(){
        return "I'm paid user";
    }
    @GetMapping("/enterprise")
    public String getEnterpriseUser(){
        return "I'm enterprise user";
    }
}
