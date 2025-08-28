public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidade;
    private Unidadefederativa uf;

    public Endereco(String logradouro, int numero, String complemento, String cep, String cidade, Unidadefederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() { return logradouro; }
    public int getNumero() { return numero; }
    public String getComplemento() { return complemento; }
    public String getCep() { return cep; }
    public String getCidade() { return cidade; }
    public Unidadefederativa getUf() { return uf; }

    @Override
    public String toString() {
        return logradouro + ", " + numero +
                (complemento.isEmpty() ? "" : " (" + complemento + ")") +
                " - " + cidade + ", " + uf +
                " - CEP: " + cep;
    }
}
