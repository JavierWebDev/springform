package com.campuslands.springform.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // INSERTAR VALORES EN EL HTML
    @GetMapping("/form")
    public String form(Map<String,Object> model) {
        return "form";
    }
    
}
