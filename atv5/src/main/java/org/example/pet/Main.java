package org.example.pet;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("billy", "4", "buldog", "medio", "carne");
        Pet pet2 = new Pet("tutituti", "2", "pinchi", "pequeno", "feijao");

        // Mostrando dados do pet1
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade());
        System.out.println("Raça: " + pet1.getRaca());
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Alimentação: " + pet1.getAlimentacao());

        System.out.println(); // linha em branco

        // Mostrando dados do pet2
        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade());
        System.out.println("Raça: " + pet2.getRaca());
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Alimentação: " + pet2.getAlimentacao());

        System.out.println(); // linha em branco

        // Mostrando a saída do toString()
        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
    }
}
