package com.example.atvdush.model;

public enum Sexo {
    MASCULINO ("MASCULINO"),
    FEMININO ("FEMININO");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
