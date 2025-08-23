package org.example.atvpetcliente;

public class Main {
    public static void main(String[] args) {

        Pet pet1 = new Pet("Jack", 5, "Golden ");
        Cliente cliente1 = new Cliente("Maria", 30, pet1);


        System.out.println(cliente1);
    }
}
