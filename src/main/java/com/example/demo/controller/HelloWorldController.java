package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 문자열, json, xml 등 응답
public class HelloWorldController {

    @GetMapping( "/")
    public String hello(){
        return "hello";
    }

}
