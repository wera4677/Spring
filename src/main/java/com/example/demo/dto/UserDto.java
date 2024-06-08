package com.example.demo.dto;

import java.util.List;

public class UserDto {
    Integer id;
    String name;
    String email;
    List<SpecialtyDto> specialties;

    //멤버 변수 초기화
    public UserDto(Integer id, String name, String email, List<SpecialtyDto> specialties) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.specialties = specialties;
    }

    //반환
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<SpecialtyDto> getSpecialties() {
        return specialties;
    }
}
