package org.example.pet;

public class Pet {
    private String nome;
    private String idade;
    private String raca;
    private String porte;
    private String alimentacao;

    public Pet(String nome, String idade, String raca, String porte, String alimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.alimentacao = alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getPorte() {
        return porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", raca='" + raca + '\'' +
                ", porte='" + porte + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }
}
