package com.Project.Login;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.List.of;

@CrossOrigin(origins = "http://localhost:5173/")

@RestController
@RequestMapping("/login-page")

public class LoginPage {

    @GetMapping
    public String loginMsg(){
        return "The Information from the React Frontend has recieved!";
    }

    @PostMapping
    public String loginUser(@RequestBody Users request) {

        System.out.println("Username: " + request.getUsername());
        System.out.println("Password: " + request.getPassword());

        return "Login received!";
    }
}
