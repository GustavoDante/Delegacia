package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Denuncia;
import model.fachada.FachadaSistema;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BOAnonimoController implements Initializable {

    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField endereco;

    @FXML
    private ComboBox<String> comboBox;

    private List<String> categorias = new ArrayList<>();
    private ObservableList<String> observableList;

    @FXML
    private TextArea denuncia;

    @FXML
    private Text text;

    @FXML
    void cadastrarDenuncia(ActionEvent event) {
        fachadaSistema.cadastrarDenuncia(new Denuncia(comboBox.getValue(), denuncia.getText(), endereco.getText()));
        text.setText("Cadastro realizado.");
    }

    @FXML
    void carregarCategorias(ActionEvent event) {
        categorias.add("Roubo");
        categorias.add("Furto");
        categorias.add("Agreção");
        categorias.add("Crimes de internet");
        categorias.add("Comercio Ilegal");
        categorias.add("Homicídio");
        categorias.add("Desaparecimento");
        categorias.add("Irregularidades em estabelecimentos públicos");
        categorias.add("Dano/Depredação");

        observableList = FXCollections.observableArrayList(categorias);
        comboBox.setItems(observableList);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarCategorias();
    }

    @FXML
    void trocarParaPrincipal(ActionEvent event) {
        Main.trocarTelas(2);
    }

    public void carregarCategorias() {
        categorias.add("Roubo");
        categorias.add("Furto");
        categorias.add("Agreção");
        categorias.add("Crimes de internet");
        categorias.add("Comercio Ilegal");
        categorias.add("Homicídio");
        categorias.add("Desaparecimento");
        categorias.add("Irregularidades em estabelecimentos públicos");
        categorias.add("Dano/Depredação");

        observableList = FXCollections.observableArrayList(categorias);
        comboBox.setItems(observableList);
    }

}
