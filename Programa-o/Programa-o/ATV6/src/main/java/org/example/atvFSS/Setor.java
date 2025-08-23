package org.example.atvFSS;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RH("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing"),
    TECNOLOGIA("Tecnologia da Informação");

    private final String descricao;

    Setor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
