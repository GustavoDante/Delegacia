package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Viatura;
import model.fachada.FachadaSistema;

public class CadastroViaturaController {
    FachadaSistema aux = new FachadaSistema();
    FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField tipo;

    @FXML
    private TextField placa;

    @FXML
    private TextField ano;

    @FXML
    private Text text;

    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void cadastrarViatura(ActionEvent event) {
        fachadaSistema.cadastrarViatura(new Viatura(placa.getText(), ano.getText(), tipo.getText()));
        text.setText("Cadastro realizado com sucesso.");
    }

}
