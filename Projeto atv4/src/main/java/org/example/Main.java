package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instanciar objetos
        Pessoa pessoa1 = new Pessoa( "Eliane",  42);
        Produto produto1 = new Produto( "TV",  50.90);

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:  ");
        String nome = ler.next();
        System.out.println("Digite sua idade:  ");
        int idade = ler.nextInt();



        // Atribuição de valores
        pessoa1.setNome("Eliane");
        pessoa1.setIdade(42);

        produto1.setNome("TV");
        produto1.setValor(50.0);

        // Exibir informações
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Valor do produto: R$" + produto1.getValor());
    }
}
