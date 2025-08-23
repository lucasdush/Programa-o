import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        String resposta;

        do {
            double nota;

            // Validação da nota
            do {
                System.out.print("Digite uma nota (entre 0 e 10): ");
                nota = ler.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Por favor, digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            notas.add(nota);

            System.out.print("Deseja inserir mais uma nota? (Digite 'n' para sair): ");
            resposta = ler.next();
        } while (!resposta.equalsIgnoreCase("n"));

        // Exibição das notas
        System.out.println("\nNotas inseridas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        ler.close();
    }
}
