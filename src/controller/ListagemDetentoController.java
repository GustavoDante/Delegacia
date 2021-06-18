package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import model.exception.RepositorioVazioException;
import model.fachada.FachadaSistema;

public class ListagemDetentoController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextArea text;
    @FXML
    void atualizarLista(ActionEvent event) {
        try {
            text.setText(fachadaSistema.exibirDetentos().toString());
        } catch (RepositorioVazioException e){
            text.setText("Não há Detentos cadastrados.");
        }
    }
    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(24);
    }

}
