package com.example.lucasdush.Model;

public enum UnidadeFederativa {

    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

private final String nome;


 private String sigla(){
    if(this==BAHIA) return "BA";
    if(this==SAO_PAULO) return "SP";    
 }




}
