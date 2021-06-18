package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaBOController {

    @FXML
    private Button pessoaFisica;

    @FXML
    private Button pessoaJuridica;

    @FXML
    private Button cancelar;

    @FXML
    void trocaParaPF(ActionEvent event) {
        Main.trocarTelas(3);
    }

    @FXML
    void trocaParaPJ(ActionEvent event) {
        Main.trocarTelas(4);
    }

    @FXML
    void trocarParaPrincipal(ActionEvent event) {
        Main.trocarTelas(32);
    }

    @FXML
    private Button anonimo;

    @FXML
    void trocaParaAnonimo(ActionEvent event) {
        Main.trocarTelas(40);
    }

}
