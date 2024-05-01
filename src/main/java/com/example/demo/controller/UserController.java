package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@Autowired
UserService userService;

    @GetMapping("/user/{idNumber}")
    public User getUserDetails(@PathVariable("idNumber") Long id){
        return userService.getUserDetails(id);

    }

    @GetMapping("/user")
    public User getUserDetails2(@RequestParam("id") Long id){
        return userService.getUserDetails(id);

    }
//    ToDo:Implement create user API .
}
