package org.example;

public abstract class Funcionario implements Salariofinal{

    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double Salariobase;
    protected String DatadeNascimento;
    protected String DataAdmissao;

    public Funcionario(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datadeNascimento, String dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        Salariobase = salariobase;
        DatadeNascimento = datadeNascimento;
        DataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return null;
    }

    public abstract void admitir(Motoboy motoboy);

    public void demitir(Motoboy motoboy) {
    }
}
