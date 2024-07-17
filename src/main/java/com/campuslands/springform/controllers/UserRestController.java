package com.campuslands.springform.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.campuslands.springform.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public List<User> details() {
        List<User> lstUser = new ArrayList<>();
        return lstUser;
    }

    @PostMapping("/details")
    public List<User> postMethodName(@RequestBody String entity) {
        List<User> lstUser = new ArrayList<>();
        
        return lstUser;
    }
    
    
}
