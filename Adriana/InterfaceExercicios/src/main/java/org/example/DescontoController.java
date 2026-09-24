package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DescontoController {

    @FXML private TextField txtArroz;
    @FXML private TextField txtFeijao;
    @FXML private TextField txtOleo;
    @FXML private TextField txtAcucar;
    @FXML private TextField txtCafe;
    @FXML private TextField txtMacarrao;
    @FXML private TextField txtFarinha;
    @FXML private TextField txtFuba;
    @FXML private TextField txtMolho;
    @FXML private TextField txtSal;

    @FXML private Label lblSubtotal;
    @FXML private Label lblTotalFinal;
    @FXML private Label lblStatus;

    @FXML
    private void onCalcularClick() {
        try {
            double[] precos = new double[]{
                    Double.parseDouble(txtArroz.getText()),
                    Double.parseDouble(txtFeijao.getText()),
                    Double.parseDouble(txtOleo.getText()),
                    Double.parseDouble(txtAcucar.getText()),
                    Double.parseDouble(txtCafe.getText()),
                    Double.parseDouble(txtMacarrao.getText()),
                    Double.parseDouble(txtFarinha.getText()),
                    Double.parseDouble(txtFuba.getText()),
                    Double.parseDouble(txtMolho.getText()),
                    Double.parseDouble(txtSal.getText())
            };

            Desconto d = new Desconto(precos);
            double subtotal = d.calcularSubtotal();
            double total = d.calcularTotalComDesconto();

            lblSubtotal.setText(String.format("Subtotal: R$ %.2f", subtotal));
            lblTotalFinal.setText(String.format("Total: R$ %.2f", total));

            if (d.possuiDesconto()) {
                lblStatus.setText("Desconto de 10% aplicado!");
            } else {
                lblStatus.setText("Sem desconto (mínimo R$ 100,00).");
            }
        } catch (NumberFormatException e) {
            lblStatus.setText("Preencha todos os campos com valores válidos.");
        }
    }
}