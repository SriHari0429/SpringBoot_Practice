package com.example.demo.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@Accessors(chain = true)
@Component
public class User {
    private Long id;
    private String name;
    private Double salary;
}

//ctrl alt l
//ctrl alt o