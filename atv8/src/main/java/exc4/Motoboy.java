package exc4;

public class Motoboy extends Funcionario {

    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataDeNascimento, double salariobase, String placaDaMoto) {
        super(nome, cpf, dataDeNascimento, salariobase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double obtersalariofinal() {
        return super.salariobase;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salariobase=" + salariobase +
                '}';
    }
}
