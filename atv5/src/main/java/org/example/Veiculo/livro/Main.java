package org.example.Veiculo.livro;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Gunbound", "Jack", "Sperou", 300, 59.90);
        Veiculo veiculo1 = new Veiculo("OUP7667", "branca", 5, 4, 200, 16.5);



        System.out.println(livro1.toString());
        System.out.println(veiculo1.toString());
    }
}
