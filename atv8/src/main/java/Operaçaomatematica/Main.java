package Operaçaomatematica;

public class Main {
    public static void main(String[] args) {

        Soma soma = new Soma();
        Subtraçao subtraçao = new Subtraçao();
        Multiplicaçao multiplicaçao = new Multiplicaçao();
        Divisao divisao = new Divisao();


        System.out.println(soma.calcular(3,5));
        System.out.println(subtraçao.calcular(5,9));
        System.out.println(multiplicaçao.calcular(7,9));
        System.out.println(divisao.calcular(6,12));

    }
}
