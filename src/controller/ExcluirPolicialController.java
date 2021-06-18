package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.exception.CPFInexistenteException;
import model.exception.CPFInvalidoException;
import model.fachada.FachadaSistema;

public class ExcluirPolicialController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField cpf;

    @FXML
    private Text text;

    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void excluirPolicial(ActionEvent event) {
        try {
            fachadaSistema.removerPoliciais(cpf.getText());
            text.setText("Exclusão realizada com sucesso!.");
        } catch (CPFInexistenteException e) {
            text.setText("Esse cpf nao consta no sistema.");
        } catch (CPFInvalidoException e) {
            text.setText("Digite um cpf válido, apenas os numeros.");
        }
    }

}
