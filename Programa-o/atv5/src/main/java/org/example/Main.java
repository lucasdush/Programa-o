package org.example;

import org.example.pet.Pet;

public class Main {
    public static void main(String[] args) {

        // Instanciar uma classe
        Cliente cliente1 = new Cliente("Dush", 32);
        Cliente cliente2 = new Cliente("Liu", 42);
        // Mostrar os dados
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Idade: " + cliente2.getIdade());

        // Mostrar o toString()
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}


