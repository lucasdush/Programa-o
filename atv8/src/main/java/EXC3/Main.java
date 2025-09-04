public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor("Eliane Barbosa", "10/05/1982", Sexo.FEMININO, Setor.FINANCEIRO, 10000);
        Motoboy motoboy = new Motoboy("Lucas Xavier", "15/08/1990", Sexo.MASCULINO, Setor.OPERACOES, 3000, "D");

        System.out.println(diretor);
        System.out.println(motoboy);

        diretor.admitir(motoboy);
        diretor.demitir(motoboy);
    }
}
