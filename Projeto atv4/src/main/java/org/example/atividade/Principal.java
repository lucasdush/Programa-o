public class Principal {
    public static void main(String[] args) {
        // Instanciando livros com seus respectivos valores
        Livro livro1 = new Livro("Vamo beber", "Lucas Xavier", "1000", "99,90");
        Livro livro2 = new Livro("Piratas do Caribe", "Jack Sperou", "800", "59,90");

        // Exibindo as informações dos livros
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
