import java.util.Scanner;

public class vetores {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[3];
        double soma = 0;

    
        for (int i = 0; i < 3; i++) {
            double nota;
            do {
                System.out.print("Digite a " + (i + 1) + "ª nota (entre 0 e 10): ");
                nota = ler.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            notas[i] = nota;
            soma += nota;
        }


        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }


        double media = soma / notas.length;
        System.out.println("Sua média é: " + media);

        ler.close();
    }
}
