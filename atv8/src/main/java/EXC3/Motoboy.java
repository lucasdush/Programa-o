public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase; // Motoboy não tem bônus
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCarteira de Habilitação: " + carteiraDeHabilitacao +
                "\nSalário Final: " + getSalarioFinal();
    }
}