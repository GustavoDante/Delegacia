package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.exception.CPFInexistenteException;
import model.exception.CPFInvalidoException;

import model.fachada.FachadaSistema;

public class BuscaDetentoController {
    FachadaSistema aux = new FachadaSistema();
    FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());
    @FXML
    private TextField cpf;

    @FXML
    private TextArea resultado;

    @FXML
    void buscarDetento(ActionEvent event) {
        try {
            resultado.setText(fachadaSistema.buscarDetento(cpf.getText()).toString());
        }catch (NumberFormatException a){
            resultado.setText("Digite apenas numeros.");
        } catch (CPFInexistenteException e) {
            resultado.setText("CPF digitado não existe no programa");
        } catch (CPFInvalidoException e) {
            resultado.setText("Digite um cpf valido");
        }
    }

    @FXML
    void voltarParaAnterior(ActionEvent event) {
        Main.trocarTelas(24);
    }

}
