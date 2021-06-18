package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.exception.CPFInexistenteException;
import model.exception.CPFInvalidoException;
import model.fachada.FachadaSistema;

public class BuscaPolicialController {
    FachadaSistema aux = new FachadaSistema();
    FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());
    @FXML
    private TextField cpf;

    @FXML
    private TextArea resultado;
    @FXML
    void buscarPolicial(ActionEvent event) {
        try {
            resultado.setText(fachadaSistema.buscarPolicial(cpf.getText()).toString());
        } catch (CPFInexistenteException e) {
            resultado.setText("CPF digitado não existe no sistema");
        } catch (CPFInvalidoException e) {
            resultado.setText("Cpf invalido, digite apenas numeros");
        }
    }

    @FXML
    void voltarParaAnterior(ActionEvent event) {
        Main.trocarTelas(24);
    }

}
