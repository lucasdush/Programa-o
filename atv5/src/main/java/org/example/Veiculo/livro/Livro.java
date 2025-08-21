package org.example.Veiculo.livro;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int numeropaginas;
    private double valorcompra;

    public Livro(String titulo, String autor, String ISBN, int numeropaginas, double valorcompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeropaginas = numeropaginas;
        this.valorcompra = valorcompra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public double getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(double valorcompra) {
        this.valorcompra = valorcompra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numeropaginas=" + numeropaginas +
                ", valorcompra=" + valorcompra +
                '}';
    }
}
