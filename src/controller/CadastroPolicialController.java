package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Policial;
import model.exception.CPFInvalidoException;
import model.exception.CPFJaExisteException;
import model.exception.SalarioInvalidoException;
import model.fachada.FachadaSistema;

public class CadastroPolicialController {
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
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void cadastrarPolicial(ActionEvent event) {
        try{
            fachadaSistema.cadastrarPolicial(new Policial(nome.getText(), salario.getText(), pdf.getText(), cpf.getText()));
            text.setText("Cadastro realizado com sucesso!");
        }catch(CPFInvalidoException a){
            text.setText("CPF invalido, digite apenas os numero, sem simbolos ou traços.");
        }catch(SalarioInvalidoException e){
            text.setText("Salario invalido, digite apenas os numero, sem simbolos ou traços.");
        }catch (CPFJaExisteException e) {
            text.setText("CPF já existe no sistema, verifique o cpf digitado e tente novamente");
        }
    }

}
