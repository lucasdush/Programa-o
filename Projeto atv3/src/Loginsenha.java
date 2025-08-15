import java.util.Scanner;

public class Loginsenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String loginCorreto = "Dush";
        String senhaCorreta = "1234";

        System.out.println("Login:");
        String login = sc.nextLine();

        System.out.println("Senha:");
        String senha = sc.nextLine();

        if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Bem-vindo usuário, logado!");
        } else {
            System.out.println("Login ou senha inválida.");
        }

        sc.close();
    }
}
