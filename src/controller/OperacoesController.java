package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class OperacoesController {

    @FXML
    void trocarAtualizarDelegado(ActionEvent event) {
        Main.trocarTelas(26);
    }

    @FXML
    void trocarAtualizarDetento(ActionEvent event) {
        Main.trocarTelas(29);
    }

    @FXML
    void trocarAtualizarFuncionario(ActionEvent event) {
        Main.trocarTelas(30);
    }

    @FXML
    void trocarAtualizarPolicial(ActionEvent event) {
        Main.trocarTelas(25);
    }

    @FXML
    void trocarAtualizarViatura(ActionEvent event) {
        Main.trocarTelas(31);
    }

    @FXML
    void trocarExcluirDelegado(ActionEvent event) {
        Main.trocarTelas(18);
    }

    @FXML
    void trocarExcluirDetento(ActionEvent event) {
        Main.trocarTelas(20);
    }

    @FXML
    void trocarExcluirFuncionario(ActionEvent event) {
        Main.trocarTelas(21);
    }

    @FXML
    void trocarExcluirPolicial(ActionEvent event) {
        Main.trocarTelas(22);
    }

    @FXML
    void trocarExcluirViatura(ActionEvent event) {
        Main.trocarTelas(23);
    }

    @FXML
    void trocarParaCadastroDelegado(ActionEvent event) {
        Main.trocarTelas(6);
    }

    @FXML
    void trocarParaCadastroDetento(ActionEvent event) {
        Main.trocarTelas(8);
    }

    @FXML
    void trocarParaCadastroFuncionario(ActionEvent event) {
        Main.trocarTelas(9);
    }

    @FXML
    void trocarParaCadastroPolicial(ActionEvent event) {
        Main.trocarTelas(11);
    }

    @FXML
    void trocarParaCadastroViatura(ActionEvent event) {
        Main.trocarTelas(10);
    }

    @FXML
    void trocarParaPrincipal(ActionEvent event) {
        Main.trocarTelas(1);
    }

}
