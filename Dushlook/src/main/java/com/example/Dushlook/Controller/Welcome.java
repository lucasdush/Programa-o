package com.example.Dushlook.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
public class Welcome {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to Dushlook";
    }

}
