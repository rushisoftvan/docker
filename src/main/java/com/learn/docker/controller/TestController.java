package com.learn.docker.controller;

import com.learn.docker.entities.UserEntity;
import com.learn.docker.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/test")
@RequiredArgsConstructor
public class TestController {



    private final UserRepository userRepository;

    @GetMapping("/users")
    public String getAllUser(){
        return "rashik";
    }

    @GetMapping("/c")
    public ResponseEntity<List<UserEntity>> getAllUsers(){
        List<UserEntity> all = userRepository.findAll();
        for(UserEntity user : all){
            user.getId();

        }
        return ResponseEntity.ok(all);
    }

    @GetMapping("hello")
    public String m1(){
        return "hello word";
    }

}
