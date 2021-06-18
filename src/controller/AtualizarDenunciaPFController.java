package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AtualizarDenunciaPFController implements Initializable {

    private List<String> categorias = new ArrayList<>();
    private ObservableList<String> observableList;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    void atualizarDenuncia(ActionEvent event) {

    }

    @FXML
    void carregarCategorias(ActionEvent event) {

    }

    @FXML
    void trocarParaPrincipal(ActionEvent event) {
        Main.trocarTelas(5);
    }
    public void initialize(URL location, ResourceBundle resources) {
        carregarCategorias();
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
