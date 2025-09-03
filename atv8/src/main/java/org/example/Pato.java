package org.example;

public class Pato implements Animal{
    @Override
    public String emitirSom() {
        return "kuekue";
    }
    @Override
    public String comer() {
        return "peixe";
    }
}
