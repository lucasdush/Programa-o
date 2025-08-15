public class ComparacaoTipos {
    public static void main (String[] args){
        String nomeUsuario = "Lucas";
        int senha = 1717;

        boolean resultadoNome = nomeUsuario.equals("Lucas");
        boolean resultadoSenha = (senha == 2020);


        System.out.println("O nome do Usuario esta correto? " + resultadoNome);
        System.out.println("A senha esta correta?  "   + resultadoSenha);
    }
}
