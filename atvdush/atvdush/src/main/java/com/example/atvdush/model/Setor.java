package com.example.atvdush.model;

public enum Setor {
    ENGENHARIA ( "ENGENHARIA"),
    SAUDE ("SAUDE"),
    JURIDICO("JURIDICO");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
