package org.example;

public class Desconto {
    private double[] precosProdutos;

    public Desconto(double[] precosProdutos) {
        this.precosProdutos = precosProdutos;
    }

    public double calcularSubtotal() {
        double soma = 0;
        for (double preco : precosProdutos) {
            soma += preco;
        }
        return soma;
    }

    public double calcularTotalComDesconto() {
        double subtotal = calcularSubtotal();
        if (possuiDesconto()) {
            return subtotal * 0.90;
        }
        return subtotal;
    }

    public boolean possuiDesconto() {
        return calcularSubtotal() >= 100.0;
    }
}