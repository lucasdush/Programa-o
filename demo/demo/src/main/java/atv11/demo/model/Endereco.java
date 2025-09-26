package atv11.demo.model;

import jakarta.persistence.Column;

public class Endereco {

        @Column(nullable = false)
        private String logradouro;
        @Column(nullable = false)
        private String numero;
        @Column(nullable = false)
        private String cidade;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
