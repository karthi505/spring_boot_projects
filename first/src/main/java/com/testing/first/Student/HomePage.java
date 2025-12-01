package com.testing.first.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @GetMapping
    public String HomePageMssg(){
        return "this is the home page";
    }
}
