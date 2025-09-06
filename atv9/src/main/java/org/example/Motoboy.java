package org.example;

public class Motoboy extends Funcionario {
    private String Placadamoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salariobase, String datadeNascimento, String dataAdmissao, String placadamoto) {
        super(nome, cpf, rg, sexo, salariobase, datadeNascimento, dataAdmissao);
        Placadamoto = placadamoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "Placadamoto='" + Placadamoto + '\'' +
                ", nome='" + nome + '\'' +
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
