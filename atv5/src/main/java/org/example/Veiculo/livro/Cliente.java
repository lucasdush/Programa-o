package org.example.Veiculo.livro;

public class Cliente {
    private String Nome;
    private int Idade;
    private String CPF;
    private String Endereço;
    private String Telefone;

    public Cliente(String nome, int idade, String CPF, String endereço, String telefone) {
        Nome = nome;
        Idade = idade;
        this.CPF = CPF;
        Endereço = endereço;
        Telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", CPF='" + CPF + '\'' +
                ", Endereço='" + Endereço + '\'' +
                ", Telefone='" + Telefone + '\'' +
                '}';
    }
}
