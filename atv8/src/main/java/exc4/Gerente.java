package exc4;

public class Gerente extends Cargodeconfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataDeNascimento, double salariobase) {
        super(nome, cpf, dataDeNascimento, salariobase);
        this.bonificacao = Bonificacao.GERENTE; // inicializa bonificação
    }

    @Override
    public double obtersalariofinal() {
        return super.salariobase * super.bonificacao.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println(this.nome + " admitiu " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println(this.nome + " demitiu " + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salariobase=" + salariobase +
                '}';
    }
}
