public class metodosString {
    public static void main(String[] args){
        String nome = "Lucas";
        String sobrenome = "Xavier";

        System.out.println("Tamanho do nome: "+ nome.length());
        System.out.printf("Tamanho do sobrenome:"+ sobrenome.length());


        String nomeCompleto = nome.concat(" ").concat(sobrenome);



        System.out.println("Concatenação Maiúscula: "+ nomeCompleto.toUpperCase());

        System.out.println("Concatenação Minúscula: "+ nomeCompleto.toLowerCase());
    }
}
