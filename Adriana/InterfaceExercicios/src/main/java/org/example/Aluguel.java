package org.example;

public class Aluguel {
    private double valorDiaria;
    private int dias;
    private double quilometragem;
    private static final double TAXA_EXCEDENTE = 560.0;
    private static final double LIMITE_KM = 300.0;

    public Aluguel(double valorDiaria, int dias, double quilometragem) {
        this.valorDiaria = valorDiaria;
        this.dias = dias;
        this.quilometragem = quilometragem;
    }

    public double calcularTotal() {
        double valor = valorDiaria * dias;
        if (aplicouTaxa()) {
            valor += TAXA_EXCEDENTE;
        }
        return valor;
    }

    public boolean aplicouTaxa() {
        return quilometragem >= LIMITE_KM;
    }
}