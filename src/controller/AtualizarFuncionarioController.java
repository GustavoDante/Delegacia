package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.entidade.Funcionario;
import model.exception.CPFInexistenteException;
import model.exception.CPFInvalidoException;
import model.exception.SalarioInvalidoException;
import model.fachada.FachadaSistema;

public class AtualizarFuncionarioController {
    private FachadaSistema aux = new FachadaSistema();
    private FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private TextField nome;

    @FXML
    private TextField cpfNovo;

    @FXML
    private TextField cpfAntigo;

    @FXML
    private TextField pdf;

    @FXML
    private TextField salario;

    @FXML
    private Text text;

    @FXML
    private TextField funcao;

    @FXML
    void mudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void atualizarFuncionario(ActionEvent event) {
        try {
            fachadaSistema.atualizarFuncionario(new Funcionario(funcao.getText(), pdf.getText(), salario.getText(), nome.getText(), cpfNovo.getText()), cpfAntigo.getText());
            text.setText("Funcionario atualizado.");
        } catch (CPFInexistenteException e) {
            text.setText("O cpf digitado nao correponde a alguem do sistema.");
        } catch (CPFInvalidoException e) {
            text.setText("CPF invalido, digite apenas os numero, sem simbolos ou traços.");
        } catch (SalarioInvalidoException e) {
            text.setText("Salario invalido, digite apenas os numero, sem simbolos ou traços.");
        }
    }

}
