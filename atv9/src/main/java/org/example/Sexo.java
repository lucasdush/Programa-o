package org.example;

public enum Sexo {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");

    public String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
