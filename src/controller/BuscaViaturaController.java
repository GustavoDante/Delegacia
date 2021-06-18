package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.exception.IdInexistenteException;
import model.fachada.FachadaSistema;

public class BuscaViaturaController {
    FachadaSistema aux = new FachadaSistema();
    FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());
    @FXML
    private TextField id;

    @FXML
    private TextArea resultado;
    @FXML
    void buscarViatura(ActionEvent event) {
        try {
            resultado.setText(fachadaSistema.buscarViatura(Integer.parseInt(id.getText())).toString());
        } catch (IdInexistenteException e) {
            resultado.setText("Id não consta no sistema.");
        }
    }

    @FXML
    void voltarParaAnterior(ActionEvent event) {
        Main.trocarTelas(24);
    }

}
