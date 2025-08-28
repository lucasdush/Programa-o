public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS("Recursos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    private final String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
