public enum Unidadefederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private final String nome;
    private final String sigla;

    Unidadefederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return nome + " (" + sigla + ")";
    }
}
