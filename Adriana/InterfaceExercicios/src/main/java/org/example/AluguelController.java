package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AluguelController {

    @FXML private TextField txtDiaria;
    @FXML private TextField txtDias;
    @FXML private TextField txtKm;
    @FXML private TextField txtResultado;

    @FXML
    private void onCalcularClick() {
        try {
            double diaria = Double.parseDouble(txtDiaria.getText());
            int dias = Integer.parseInt(txtDias.getText());
            double km = Double.parseDouble(txtKm.getText());

            Aluguel a = new Aluguel(diaria, dias, km);
            double total = a.calcularTotal();

            if (a.aplicouTaxa()) {
                txtResultado.setText(String.format("Taxa aplicada (+R$ 560). Total: R$ %.2f", total));
            } else {
                txtResultado.setText(String.format("Sem taxa extra. Total: R$ %.2f", total));
            }
        } catch (NumberFormatException e) {
            txtResultado.setText("Preencha todos os campos corretamente.");
        }
    }
}