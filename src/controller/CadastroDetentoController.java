package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Detento;
import model.exception.*;
import model.fachada.FachadaSistema;

public class CadastroDetentoController {
  FachadaSistema aux = new FachadaSistema();
  FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());
    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private TextField delito;

    @FXML
    private TextField dataDeChegada;

    @FXML
    private Text text;

    @FXML
    void cadastrarDetento(ActionEvent event) {
        try{
            fachadaSistema.cadastrarDetento(new Detento(nome.getText(), cpf.getText(), delito.getText(), dataDeChegada.getText()));
            text.setText("Cadastro realizado com sucesso!");
        }catch(CPFInvalidoException a){
            text.setText("CPF invalido, digite apenas os numero, sem simbolos ou traços.");
        }catch (CPFJaExisteException e) {
            text.setText("CPF já existe no sistema, verifique o cpf digitado e tente novamente");
        }catch (CelasCheiasException e) {
            text.setText("Não há mais vagas nas celas.");
        }
    }

}
