package org.example.Veiculo.livro;

public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Gunbound", "Jack", "Sperou", 300, 59.90);
        Veiculo veiculo1 = new Veiculo("OUP7667", "branca", 5, 4, 200, 16.5);
        Cliente cliente1 = new Cliente("Lucas",34,"64513256412","Sistema Solar blc 132","71949494558");



        System.out.println(livro1.toString());
        System.out.println(veiculo1.toString());
        System.out.println(cliente1.toString());
    }
}
