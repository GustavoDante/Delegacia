package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.text.Text;
import model.exception.DelegadoInexistenteException;
import model.fachada.FachadaSistema;

public class ExcluirDelegadoController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private Text text;

    @FXML
    void excluirDelegado(ActionEvent event) {
        try {
            fachadaSistema.removerDelegado();
            text.setText("Exclusão realizada!.");
        } catch (DelegadoInexistenteException e) {
            text.setText("Já nao existe um Delegado cadastrado, por favor, cadastre um.");
        }
    }

    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }
}
