public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() { return carteiraDeHabilitacao; }
    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) { this.carteiraDeHabilitacao = carteiraDeHabilitacao; }

    @Override
    public double getSalarioFinal() {
        return salarioBase; // sem bônus
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Motoboy" +
                "\nCarteira de Habilitação: " + carteiraDeHabilitacao +
                "\nSalário Final: " + getSalarioFinal();
    }
}
