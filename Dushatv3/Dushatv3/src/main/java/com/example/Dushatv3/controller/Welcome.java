package com.example.Dushatv3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

     @GetMapping("/")
    public String welcome(){
         return "É o Bicho! ";
     }

      @GetMapping("/dev")
    public String dev(){
         return "Desenvolvedor barril";

    }
}
