package com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.controllers;

import com.example.codeclan.w13d2_annotations_SpringDataREST_RESTful.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;
}
