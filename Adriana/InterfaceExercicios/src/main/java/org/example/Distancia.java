package org.example;

public class Distancia {
    private double distanciaKm;
    private double precoGasolina;
    private static final double CONSUMO_KM_LITRO = 12.0;

    public Distancia(double distanciaKm, double precoGasolina) {
        this.distanciaKm = distanciaKm;
        this.precoGasolina = precoGasolina;
    }

    public double calcularLitrosNecessarios() {
        return distanciaKm / CONSUMO_KM_LITRO;
    }

    public double calcularCustoTotal() {
        double preco = calcularLitrosNecessarios() * precoGasolina;
        if (possuiDesconto()) {
            preco -= (preco * 0.05);
        }
        return preco;
    }

    public boolean possuiDesconto() {
        return distanciaKm >= 500.0;
    }
}