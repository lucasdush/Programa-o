

// Classe abstrata Funcionario
public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nSexo: " + sexo.getTexto() +
                "\nSetor: " + setor.getNome() +
                "\nSalário Base: " + salarioBase;
    }
}