package org.example;

public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Rua das Flores", 123, "Salvador");
        Cliente cliente1 = new Cliente("Lucas xavier", 30, endereco1);

        System.out.println(cliente1.toString());
    }
}
