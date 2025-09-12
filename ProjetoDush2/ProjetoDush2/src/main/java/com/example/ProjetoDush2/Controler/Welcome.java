package com.example.ProjetoDush2.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String Welcome (){
        return "Bem vindo";
    }

    @GetMapping("/P")
    public String Welcom (){
        return "É o Bicho. ";
    }
    @GetMapping("/B")
    public String Welco (){
        return "To Retado.";
    }
}
