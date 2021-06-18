package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class OperacoesDenunciaController {

    @FXML
    void trocarParaAnterior(ActionEvent event) {
        Main.trocarTelas(1);
    }

    @FXML
    void trocarParaBuscar(ActionEvent event) {
        Main.trocarTelas(12);
    }

    @FXML
    void trocarParaCadastro(ActionEvent event) {
        Main.trocarTelas(2);
    }

    @FXML
    void trocarParaExcluir(ActionEvent event) {
        Main.trocarTelas(19);
    }

}
