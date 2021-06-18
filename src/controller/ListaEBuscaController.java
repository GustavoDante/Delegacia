package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ListaEBuscaController {

    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(1);
    }

    @FXML
    void mudarParaBuscarDenuncia(ActionEvent event) {
        Main.trocarTelas(12);
    }

    @FXML
    void mudarParaBuscarDetento(ActionEvent event) {
        Main.trocarTelas(13);
    }
    @FXML
    void mudarParaBuscarFuncionario(ActionEvent event) {
        Main.trocarTelas(14);
    }

    @FXML
    void mudarParaBuscarPolicial(ActionEvent event) {
        Main.trocarTelas(15);
    }

    @FXML
    void mudarParaBuscarViatura(ActionEvent event) {
        Main.trocarTelas(16);
    }

    @FXML
    void mudarParaMostrarDelegado(ActionEvent event) {
        Main.trocarTelas(34);
    }

    @FXML
    void mudarParaMostrarDenuncias(ActionEvent event) {
        Main.trocarTelas(36);
    }

    @FXML
    void mudarParaMostrarDetentos(ActionEvent event) {
        Main.trocarTelas(35);
    }

    @FXML
    void mudarParaMostrarFuncionarios(ActionEvent event) {
        Main.trocarTelas(37);
    }

    @FXML
    void mudarParaMostrarPoliciais(ActionEvent event) {
        Main.trocarTelas(38);
    }

    @FXML
    void mudarParaMostrarViaturas(ActionEvent event) {
        Main.trocarTelas(39);
    }

}
