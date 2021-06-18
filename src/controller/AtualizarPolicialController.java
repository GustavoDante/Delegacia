package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Policial;
import model.exception.CPFInexistenteException;
import model.exception.CPFInvalidoException;
import model.exception.SalarioInvalidoException;
import model.fachada.FachadaSistema;

public class AtualizarPolicialController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());
    @FXML
    private TextField nome;

    @FXML
    private TextField pdf;

    @FXML
    private TextField salario;

    @FXML
    private TextField cpfAntigo;

    @FXML
    private TextField cpfNovo;

    @FXML
    private Text text;
    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void atualizarPolicial(ActionEvent event) {
        try{
            fachadaSistema.atualizarPolicial(new Policial(nome.getText(), salario.getText(), pdf.getText(), cpfNovo.getText()), cpfAntigo.getText());
            text.setText("Cadastro realizado com sucesso!");
        }catch(CPFInvalidoException a){
            text.setText("CPF invalido, digite apenas os numero, sem simbolos ou traços.");
        }catch(SalarioInvalidoException e){
            text.setText("Salario invalido, digite apenas os numero, sem simbolos ou traços.");
        } catch (CPFInexistenteException e) {
            text.setText("CPF digitado não corrende a alguem no sistema.");
        }
    }

}
