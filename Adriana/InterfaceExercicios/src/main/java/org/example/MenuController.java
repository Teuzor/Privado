package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class MenuController {

    @FXML
    private void abrirAluguel(ActionEvent event) throws IOException { App.setRoot("Aluguel"); }

    @FXML
    private void abrirDesconto(ActionEvent event) throws IOException { App.setRoot("Desconto"); }

    @FXML
    private void abrirDistancia(ActionEvent event) throws IOException { App.setRoot("Distancia"); }

    @FXML
    private void abrirDivisaoCamelos(ActionEvent event) throws IOException { App.setRoot("DivisaoCamelos"); }

    @FXML
    private void abrirMultiplo(ActionEvent event) throws IOException { App.setRoot("Multiplo"); }

    @FXML
    private void abrirSenha(ActionEvent event) throws IOException { App.setRoot("Senha"); }

    @FXML
    private void abrirTemperatura(ActionEvent event) throws IOException { App.setRoot("Temperatura"); }
}