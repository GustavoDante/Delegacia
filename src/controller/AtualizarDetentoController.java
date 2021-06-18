package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Detento;
import model.exception.CPFInexistenteException;
import model.exception.CPFInvalidoException;
import model.fachada.FachadaSistema;

public class AtualizarDetentoController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());
    @FXML
    private TextField nome;

    @FXML
    private TextField cpfAntigo;

    @FXML
    private TextField cpfNovo;

    @FXML
    private TextField delito;

    @FXML
    private TextField dataDeChegada;

    @FXML
    private Text text;

    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void atualizarDetento(ActionEvent event) {
        try {
            fachadaSistema.atualizarDetento(new Detento(nome.getText(), cpfNovo.getText(), delito.getText(), dataDeChegada.getText()), cpfAntigo.getText() );
            text.setText("Detento atualizado.");
        } catch (CPFInexistenteException e) {
            text.setText("O cpf digitado nao correponde a alguem do sistema.");
        } catch (CPFInvalidoException e) {
            text.setText("O cpf digitado é invalido, digite apenas numeros.");
        }

    }

}
