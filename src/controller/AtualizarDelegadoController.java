package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Delegado;
import model.exception.CPFInvalidoException;
import model.exception.DelegadoInexistenteException;
import model.exception.SalarioInvalidoException;
import model.fachada.FachadaSistema;

public class AtualizarDelegadoController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private TextField pdf;

    @FXML
    private TextField salario;

    @FXML
    private Text text;

    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void atualizarDelegado(ActionEvent event) {
        try {
            fachadaSistema.atualizarDelegado(new Delegado(nome.getText(), salario.getText(), pdf.getText(), cpf.getText()));
            text.setText("Atualização realizada com sucesso!");
        } catch (CPFInvalidoException a) {
            text.setText("CPF invalido, digite apenas os numero, sem simbolos ou traços.");
        } catch (SalarioInvalidoException e) {
            text.setText("Salario invalido, digite apenas os numero, sem simbolos ou traços.");
        } catch (DelegadoInexistenteException e) {
            text.setText("Não há delegado para atualizar.");
        }
    }

}
