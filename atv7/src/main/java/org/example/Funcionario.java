public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private double salario;
    private Setor setor;
    private Sexo genero;

    public Funcionario(int id, String nome, int idade, double salario, Setor setor, Sexo genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
        this.genero = genero;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Sexo getGenero() {
        return genero;
    }
}
