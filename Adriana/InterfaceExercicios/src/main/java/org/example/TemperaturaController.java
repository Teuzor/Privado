package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TemperaturaController {

    @FXML
    private Label lblResultado;

    private final Temperatura temperatura = new Temperatura();

    // Ação genérica vinculada a qualquer um dos 12 botões de meses
    @FXML
    private void onMesClick(ActionEvent event) {
        Button botaoClicado = (Button) event.getSource();
        String mes = botaoClicado.getText(); // Lê o texto do botão (ex: "Janeiro")
        String resultado = temperatura.consultarMes(mes);
        lblResultado.setText(resultado);
    }

    @FXML
    private void onGerarRelatorioClick() {
        String resultado = temperatura.consultarMediaAnual();
        lblResultado.setText(resultado);
    }

    // Ação específica para o botão de Média Anual
    @FXML
    private void onMediaAnualClick() {
        String resultado = temperatura.consultarMediaAnual();
        lblResultado.setText(resultado);
    }
}