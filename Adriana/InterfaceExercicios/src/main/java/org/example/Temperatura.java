package org.example;

public class Temperatura {
    private double[] temperaturasMensais;
    private static final String[] MESES = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    public Temperatura(double[] temperaturasMensais) {
        this.temperaturasMensais = temperaturasMensais;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double t : temperaturasMensais) {
            soma += t;
        }
        return soma / temperaturasMensais.length;
    }

    public boolean eAgradavel(double temp) {
        return temp >= 18.0;
    }

    public String[] getMeses() {
        return MESES;
    }

    public double[] getTemperaturasMensais() {
        return temperaturasMensais;
    }
}