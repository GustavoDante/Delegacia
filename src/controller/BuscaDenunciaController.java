package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.exception.IdInexistenteException;
import model.fachada.FachadaSistema;


public class BuscaDenunciaController{
    FachadaSistema aux = new FachadaSistema();
    FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField id;

    @FXML
    private TextArea resultado;

    @FXML
    void buscarDenuncia(ActionEvent event) {
        try {
            resultado.setText(fachadaSistema.buscarDenuncia(Integer.parseInt(id.getText())).toString());
        } catch (IdInexistenteException e) {
            resultado.setText("Não encontrada");
        } catch (NumberFormatException a){
            resultado.setText("Digite apenas numeros.");
        }
    }

    @FXML
    void carregarCategorias(ActionEvent event) {
    }

    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(32);
    }

}
