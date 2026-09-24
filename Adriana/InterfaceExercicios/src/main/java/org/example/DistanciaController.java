package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DistanciaController {

    @FXML private TextField txtDistancia;
    @FXML private TextField txtPrecoGasolina;
    @FXML private TextField txtResultado;

    @FXML
    private void onCalcularClick() {
        try {
            double km = Double.parseDouble(txtDistancia.getText());
            double precoGas = Double.parseDouble(txtPrecoGasolina.getText());

            Distancia d = new Distancia(km, precoGas);
            double total = d.calcularCustoTotal();

            if (d.possuiDesconto()) {
                txtResultado.setText(String.format("Desconto Aplicado (5%%)! Total: R$ %.2f", total));
            } else {
                txtResultado.setText(String.format("Sem desconto. Total: R$ %.2f", total));
            }
        } catch (NumberFormatException e) {
            txtResultado.setText("Insira valores numéricos válidos.");
        }
    }
}