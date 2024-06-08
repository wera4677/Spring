package com.example.demo.controller;

import com.example.demo.dto.PostDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping
    public String getPost(){
        return "GET /post";
    }

    @PostMapping
    public String savePost(@RequestBody PostDto postDto){ //큰 용량의 데이터를 전송하기 위해 사용
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());

        return "POST /post";
    }

    @PutMapping
    public String PutPost(){
        return "Put /post";
    }

    @DeleteMapping
    public String DeletePost(){
        return "Delete /post";
    }
}
