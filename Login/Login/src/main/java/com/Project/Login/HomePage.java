package com.Project.Login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @GetMapping
    private String WelcomeMsg(){
        return "This is the HomePage";
    }
}
