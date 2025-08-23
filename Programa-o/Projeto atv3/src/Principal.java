public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // Atribuição de valores

        //p1.nome = "Dush";
        p1.setNome("Dethe");
        //p1.cpf = "456.546.777,23";
        p1.setCpf = ("456.546.777,23");
        //p2.nome = "Liu";
        p2.setNome("Sone");
        //p2.cpf = "978.988.456.66";
        p2.setCpf = ("978.988.456.66");

        // Mostrar os Valores

        //System.out.println(" Nome:  " + p1.nome);
        System.out.println(" Nome:  " + p1.getNome());
        System.out.println(" CPF:   " + p1.setCpf());
        //System.out.println(" CPF:   " + p1.cpf);
        //System.out.println(" Nome:  " + p2.nome);
        System.out.println(" Nome:  " + p2.getNome());
       // System.out.println(" CPF:   " + p2.cpf);
        System.out.println(" CPF:   " + p2.setCpf());

    }
}
