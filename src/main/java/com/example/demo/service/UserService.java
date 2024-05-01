package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserDetails(Long id) {
        User u = new User();
        u.setId(id).setName("Hari").setSalary(2222.99);
        return u;
    }

}
