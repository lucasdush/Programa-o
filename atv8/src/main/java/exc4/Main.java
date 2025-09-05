package exc4;

public class Main {
    public static void main(String[] args) {

        Funcionario motoboy = new Motoboy("Lucas", "85156465", "17/11/1990", 5000, "OUJ7667");
        Funcionario gerente = new Gerente("Jaime", "8546541634", "05/06/1987", 7000);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());

  
        ((Gerente) gerente).admitir(motoboy);
    }
}
