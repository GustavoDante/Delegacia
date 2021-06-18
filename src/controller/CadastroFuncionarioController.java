package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Funcionario;
import model.exception.CPFInvalidoException;
import model.exception.CPFJaExisteException;
import model.exception.SalarioInvalidoException;
import model.fachada.FachadaSistema;

public class CadastroFuncionarioController {
    FachadaSistema fachadaSistema = new FachadaSistema();
    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private TextField pdf;

    @FXML
    private TextField salario;

    @FXML
    private TextField funcao;

    @FXML
    private Text text;

    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void cadastrarFuncionario(ActionEvent event) {
        try{
            fachadaSistema.cadastrarFuncionario(new Funcionario(funcao.getText(), pdf.getText(), salario.getText(), nome.getText(), cpf.getText()));
            text.setText("Cadastro realizado com sucesso!");
        }catch(CPFInvalidoException a){
            text.setText("CPF invalido, digite apenas os numero, sem simbolos ou traços.");
        }catch(SalarioInvalidoException e){
            text.setText("Salario invalido, digite apenas os numero, sem simbolos ou traços.");
        } catch (CPFJaExisteException e) {
            text.setText("CPF já existe no sistema, verifique o cpf digitado e tente novamente");
        }
    }

}
