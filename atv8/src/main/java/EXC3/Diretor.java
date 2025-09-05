import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario implements Contratacao {
    private static final double PREMIO = 0.2;
    private List<Funcionario> funcionarios;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.funcionarios = new ArrayList<>();
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println(funcionario.nome + " foi admitido.");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        funcionarios.remove(funcionario);
        System.out.println(funcionario.nome + " foi demitido.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Diretor" +
                "\nSalário Final: " + getSalarioFinal();
    }
}