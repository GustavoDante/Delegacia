package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Viatura;
import model.exception.IdInexistenteException;
import model.fachada.FachadaSistema;

public class AtualizarViaturaController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField placa;

    @FXML
    private TextField ano;

    @FXML
    private TextField id;

    @FXML
    private Text text;

    @FXML
    private TextField tipo;

    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void atualizarViatura(ActionEvent event) {
        try {
            fachadaSistema.atualizarViatura(new Viatura(placa.getText(), ano.getText(), tipo.getText()), Integer.parseInt(id.getText()));
            text.setText("Atualização completa.");
        } catch (IdInexistenteException e) {
            text.setText("ID não consta no sistema");
        }
    }

}
