package exc4;

public abstract class Cargodeconfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public Cargodeconfianca(String nome, String cpf, String dataDeNascimento, double salariobase) {
        super(nome, cpf, dataDeNascimento, salariobase);
    }
}
