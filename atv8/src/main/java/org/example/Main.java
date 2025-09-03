package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
       Pato pato = new Pato();


        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comer());
        System.out.println(gato.emitirSom());
        System.out.println(gato.comer());
        System.out.println(galo.emitirSom());
        System.out.println(galo.comer());
        System.out.println(pato.emitirSom());
        System.out.println(pato.comer());
    }
}