package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class TemperaturaController {

    @FXML private TextArea txtAreaRelatorio;
    @FXML private Label lblMediaAnual;

    @FXML
    private void onGerarRelatorioClick() {
        double[] temps = {24, 24, 24, 22, 19, 18, 18, 19, 20, 22, 23, 24};
        Temperatura t = new Temperatura(temps);

        StringBuilder sb = new StringBuilder();
        String[] meses = t.getMeses();

        for (int i = 0; i < temps.length; i++) {
            String status = t.eAgradavel(temps[i]) ? "Agradável" : "Frio";
            sb.append(meses[i]).append(": ").append(temps[i]).append("°C - ").append(status).append("\n");
        }

        txtAreaRelatorio.setText(sb.toString());

        double media = t.calcularMedia();
        String statusMedia = t.eAgradavel(media) ? "Agradável" : "Frio";
        lblMediaAnual.setText(String.format("Média Anual: %.1f°C (%s)", media, statusMedia));
    }
}