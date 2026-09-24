package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MultiploController {

    @FXML private TextField txtNumero1;
    @FXML private TextField txtNumero2;
    @FXML private Label lblResultado;

    @FXML
    private void onCalcularClick() {
        try {
            float n1 = Float.parseFloat(txtNumero1.getText());
            float n2 = Float.parseFloat(txtNumero2.getText());

            Multiplo m = new Multiplo(n1, n2);

            if (m.eDivisivel()) {
                lblResultado.setText("O número " + n1 + " é divisível por " + n2);
            } else {
                lblResultado.setText("O número " + n1 + " NÃO é divisível por " + n2);
            }
        } catch (NumberFormatException e) {
            lblResultado.setText("Insira valores numéricos válidos.");
        }
    }
}
