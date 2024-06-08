package com.example.demo.controller;

import com.example.demo.dto.SpecialtyDto;
import com.example.demo.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

//    @GetMapping("/paid")
//    public String getPaidUser(){
//        return "I'm paid user";
//    }
//    @GetMapping("/enterprise")
//    public String getEnterpriseUser(){
//        return "I'm enterprise user";
//    }

    @GetMapping("/user")
    public UserDto getUser(){
        List<SpecialtyDto> specialties = new ArrayList<>();
        specialties.add(new SpecialtyDto("Java","Advanced"));
        specialties.add(new SpecialtyDto("Spring Boot","Basic"));

        return new UserDto(1,"jin","woco11@naver.com",specialties);
    }
}
