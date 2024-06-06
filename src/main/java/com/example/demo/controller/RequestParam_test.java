package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RequestParam_test {

    @RequestMapping ("/post")
    //Query String 사용 (name="") 키 이름과 파라미터 이름이 같으면 생략가능
    public String getPost(@RequestParam(name = "category",required = false,defaultValue = "IT") String category,
                          @RequestParam(name = "id",required = true,defaultValue = "0") Integer id){
        return "you requseted " + category + "-" + id + " Post"  ;
    }

    @RequestMapping("/user/{type}/id/{id}")
    //Path Parameter 사용
    public String getUser(@PathVariable(name = "type")String type,
                          @PathVariable(name = "id")Integer id){
        return "You requseted " + type + "-" + id + " User"  ;
    }
}
