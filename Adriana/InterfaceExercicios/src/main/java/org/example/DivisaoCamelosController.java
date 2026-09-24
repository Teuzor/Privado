package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DivisaoCamelosController {

    @FXML private TextField txtHeranca;

    @FXML private Label lblTotalComBeremiz;
    @FXML private Label lblIrmao1;
    @FXML private Label lblIrmao2;
    @FXML private Label lblIrmao3;
    @FXML private Label lblSobras;

    @FXML
    private void onCalcularClick() {
        try {
            int heranca = Integer.parseInt(txtHeranca.getText());
            DivisaoCamelos dc = new DivisaoCamelos(heranca);

            lblTotalComBeremiz.setText("Total com Beremiz: " + dc.getTotalCamelos());
            lblIrmao1.setText("Irmão 1 (1/2): " + dc.getIrmao1() + " camelos");
            lblIrmao2.setText("Irmão 2 (1/3): " + dc.getIrmao2() + " camelos");
            lblIrmao3.setText("Irmão 3 (1/9): " + dc.getIrmao3() + " camelos");
            lblSobras.setText("Sobraram: " + dc.getSobras() + " camelos");
        } catch (NumberFormatException e) {
            lblSobras.setText("Insira um número inteiro válido.");
        }
    }
}