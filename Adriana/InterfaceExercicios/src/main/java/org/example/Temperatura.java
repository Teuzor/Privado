package org.example;

import java.util.Map;

public class Temperatura {

    // Temperaturas médias fixas por mês em SJC
    private static final Map<String, Integer> TEMPERATURAS = Map.ofEntries(
            Map.entry("Janeiro", 24),
            Map.entry("Fevereiro", 24),
            Map.entry("Março", 24),
            Map.entry("Abril", 22),
            Map.entry("Maio", 19),
            Map.entry("Junho", 18),
            Map.entry("Julho", 18),
            Map.entry("Agosto", 19),
            Map.entry("Setembro", 20),
            Map.entry("Outubro", 22),
            Map.entry("Novembro", 23),
            Map.entry("Dezembro", 24)
    );

    public String consultarMes(String mes) {
        if (!TEMPERATURAS.containsKey(mes)) {
            return "Mês não encontrado.";
        }
        int temp = TEMPERATURAS.get(mes);
        String status = (temp >= 18) ? "Temperatura agradável." : "Frio";
        return mes + ": Temperatura Média de: " + temp + "°. " + status;
    }

    public String consultarMediaAnual() {
        int soma = 0;
        for (int temp : TEMPERATURAS.values()) {
            soma += temp;
        }
        int media = soma / TEMPERATURAS.size();
        String status = (media >= 18) ? "Temperatura agradável." : "Frio";
        return "Média Anual: Temperatura Média de: " + media + "°. " + status;
    }
}