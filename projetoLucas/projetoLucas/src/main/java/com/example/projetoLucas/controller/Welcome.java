package com.example.projetoLucas.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
   public String messagem(){
        return "Bem Vindo Vida!";
    }

    @GetMapping("/dev")
    public String dev(){
        return "Venha Desenvolver(a): Elianeeeee";
    }
}
