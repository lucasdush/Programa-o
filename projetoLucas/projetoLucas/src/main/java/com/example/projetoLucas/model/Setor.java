package com.example.projetoLucas.model;

public enum Setor {
    RECURSOS_HUMANOS( "Recursos_humanos"),
    FINANCEIRO( "Financeiro"),
    OPERACOES( "Operações");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }


}
