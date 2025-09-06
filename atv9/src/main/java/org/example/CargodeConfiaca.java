package org.example;

public abstract class CargodeConfiaca extends Funcionario{

    protected Bonificacao bonificacao;

    public CargodeConfiaca(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datadeNascimento, String dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salariobase, datadeNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }
}
