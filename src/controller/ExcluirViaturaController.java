package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.exception.IdInexistenteException;
import model.fachada.FachadaSistema;

public class ExcluirViaturaController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField id;

    @FXML
    private Text text;
    @FXML
    void excluirViatura(ActionEvent event) {
        try {
            fachadaSistema.removerViatura(Integer.parseInt(id.getText()));
            text.setText("Exclusão realizada!.");
        } catch (IdInexistenteException e) {
            text.setText("Esse Id não corresponde a uma viatura existente");
        }catch (NumberFormatException i){
            text.setText("Digite um Id Válido");
        }
    }

    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

}
