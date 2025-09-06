package org.example;

public class Diretor extends Funcionario {

    private static double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datadeNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salariobase, datadeNascimento, dataAdmissao);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", Salariobase=" + Salariobase +
                ", DatadeNascimento='" + DatadeNascimento + '\'' +
                ", DataAdmissao='" + DataAdmissao + '\'' +
                '}';
    }

    @Override
    public void admitir(Motoboy motoboy) {

    }


    @Override
    public double obtersalariofinal() {

        return 0;
    }
}
