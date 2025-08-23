package org.example.Veiculo.livro;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeropassageiro;
    private int capacidadetanque;
    private int velocidademaxima;
    private double consumomedio;

    // Construtor já recebendo os tipos corretos
    public Veiculo(String placa, String cor, int numeropassageiro, int capacidadetanque, int velocidademaxima, double consumomedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeropassageiro = numeropassageiro;
        this.capacidadetanque = capacidadetanque;
        this.velocidademaxima = velocidademaxima;
        this.consumomedio = consumomedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeropassageiro() {
        return numeropassageiro;
    }

    public void setNumeropassageiro(int numeropassageiro) {
        this.numeropassageiro = numeropassageiro;
    }

    public int getCapacidadetanque() {
        return capacidadetanque;
    }

    public void setCapacidadetanque(int capacidadetanque) {
        this.capacidadetanque = capacidadetanque;
    }

    public int getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(int velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public double getConsumomedio() {
        return consumomedio;
    }

    public void setConsumomedio(double consumomedio) {
        this.consumomedio = consumomedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", numeropassageiro=" + numeropassageiro +
                ", capacidadetanque=" + capacidadetanque +
                ", velocidademaxima=" + velocidademaxima +
                ", consumomedio=" + consumomedio +
                '}';
    }
}
