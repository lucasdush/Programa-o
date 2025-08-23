package org.example.atvFSS;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1, "Carlos Silva", 500.00, Setor.TECNOLOGIA, Sexo.MASCULINO, 32);
        Funcionario funcionario2 = new Funcionario(2, "Eliane", 300.00, Setor.RH, Sexo.FEMININO, 29);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
    }
}
