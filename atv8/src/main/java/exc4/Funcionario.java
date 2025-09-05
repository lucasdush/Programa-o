package exc4;

public abstract class Funcionario implements Salariofinal {
    protected String nome;
    protected String cpf;
    protected String dataDeNascimento;
    protected double salariobase;

    public Funcionario(String nome, String cpf, String dataDeNascimento, double salariobase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.salariobase = salariobase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salariobase=" + salariobase +
                '}';
    }

    @Override
    public abstract double obtersalariofinal();
}
