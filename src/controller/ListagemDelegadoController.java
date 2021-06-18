package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import model.exception.DelegadoInexistenteException;
import model.fachada.FachadaSistema;

public class ListagemDelegadoController{
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextArea text;

    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(24);
    }

    @FXML
    void atualizarLista(ActionEvent event) {
        try {
            text.setText(fachadaSistema.exibirDelegado().toString());
        } catch (DelegadoInexistenteException e) {
            text.setText("Não há delegado cadastrado.");
        }
    }
}
