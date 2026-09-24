package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class SenhaController {

    @FXML private PasswordField pfSenha;
    @FXML private Label lblResultado;

    @FXML
    private void onValidarClick() {
        try {
            int pwd = Integer.parseInt(pfSenha.getText());
            Senha s = new Senha();

            if (s.validar(pwd)) {
                lblResultado.setText("Acesso concedido!");
            } else {
                lblResultado.setText("Acesso negado!");
            }
        } catch (NumberFormatException e) {
            lblResultado.setText("Insira apenas números inteiros.");
        }
    }
}