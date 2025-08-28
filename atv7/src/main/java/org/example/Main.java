public class Main {
    public static void main(String[] args) {


        Endereco endereco1 = new Endereco("Rua das Flores", 123, "Casa", "40000-000", "Salvador", Unidadefederativa.BAHIA);
        Pessoa pessoa1 = new Pessoa(1, "João Silva", 30, "71999999999", "joao@email.com", Sexo.MASCULINO, endereco1);



        System.out.println(pessoa1.toString());



    }
}
