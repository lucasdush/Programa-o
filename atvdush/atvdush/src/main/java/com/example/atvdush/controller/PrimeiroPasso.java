package com.example.atvdush.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroPasso {
    @GetMapping("/")
    public String messagem(){
        return "Primeiro Exercicio Feito Sem Ajuda Do Professor";
    }
    @GetMapping("//")
    public String man(){
        return "Estou aprendendo Bastante com DEV";
    }
}
