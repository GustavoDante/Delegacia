package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Celas;
import model.fachada.FachadaSistema;

public class AtualizarCelasController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField numeroDeCelas;

    @FXML
    private Text text;

    @FXML
    private TextField numeroDeVagas;

    @FXML
    void atualizarCelas(ActionEvent event) {
        try{
            fachadaSistema.alterarVagasECelas(new Celas(Integer.parseInt(numeroDeVagas.getText()), Integer.parseInt(numeroDeCelas.getText())));
            text.setText("Celas foram atualizadas.");
        }catch(NumberFormatException a){
            text.setText("Digite apenas numeros.");
        }
    }

    @FXML
    void trocarParaPrincipal(ActionEvent event) {
        Main.trocarTelas(1);
    }

}
