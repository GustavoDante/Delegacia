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
import model.entidade.PessoaFisica;
import model.entidade.PessoaJuridica;
import model.fachada.FachadaSistema;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BOPJController implements Initializable {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField nome;

    @FXML
    private TextField endereco;

    @FXML
    private TextField cnpj;

    @FXML
    private TextField denunciado;
    @FXML
    private TextArea denuncia;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Text text;


    private List<String> categorias = new ArrayList<>();
    private ObservableList<String> observableList;

    @FXML
    void cadastrarDenuncia(ActionEvent event) {
        fachadaSistema.cadastrarDenuncia(new Denuncia(new PessoaJuridica(nome.getText(), cnpj.getText()), denuncia.getText(),  endereco.getText(), comboBox.getValue(), new PessoaFisica(denunciado.getText())));
        text.setText("Cadastro finalizado");
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

    @FXML
    void trocarParaPrincipal(ActionEvent event) {
        Main.trocarTelas(2);
    }
    @Override
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
