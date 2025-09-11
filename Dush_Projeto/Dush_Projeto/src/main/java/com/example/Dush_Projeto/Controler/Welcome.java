package com.example.Dush_Projeto.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/senai")
public class Welcome {
    @GetMapping("/")
    public String mensagem(){
        return "BORA BAHIA MINHA PORRAAAAA";
    }
@GetMapping("/dev")
    public String dev(){
        return "Lucasdush";
}
@GetMapping("/mow")
        public String mow(){
     return "Amo minha esposa Eliane de Deus Xavier";
    }
}
