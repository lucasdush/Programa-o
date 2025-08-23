
public class Livro {
    private String titulo;
    private String autor;
    private String numeroPaginas;
    private double preco;


    public Livro(String titulo, String autor, String codigo, String preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = codigo;
        this.preco = Double.parseDouble(preco.replace(",", "."));
    }


    public void exibirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Código: " + this.numeroPaginas);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println(); // Apenas uma linha em branco entre os livros
    }
}
