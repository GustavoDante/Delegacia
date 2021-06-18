package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import model.entidade.Delegado;
import model.exception.CPFInvalidoException;
import model.exception.DelegadoJaExisteException;
import model.exception.SalarioInvalidoException;
import model.fachada.FachadaSistema;

import javafx.scene.control.TextField;

public class CadastroDelegadoController {
    FachadaSistema aux = new FachadaSistema();
    FachadaSistema fachadaSistema = new FachadaSistema(aux.retornarCelas());

    @FXML
    private Text text;

    @FXML
    private TextField nome;

    @FXML
    public TextField cpf;

    @FXML
    private TextField pdf;

    @FXML
    private TextField salario;

    @FXML
    void MudarParaAnterior(ActionEvent event) {
        Main.trocarTelas(5);
    }

    @FXML
    void cadastroDelegado(ActionEvent event){
        try{
            fachadaSistema.cadastrarDelegado(new Delegado(nome.getText(), salario.getText(), pdf.getText(), cpf.getText()));
            text.setText("Cadastro realizado com sucesso!");
        }catch(CPFInvalidoException a){
            text.setText("CPF invalido, digite apenas os numero, sem simbolos ou traços.");
        }catch(SalarioInvalidoException e){
            text.setText("Salario invalido, digite apenas os numero, sem simbolos ou traços.");
        }catch(DelegadoJaExisteException i){
            text.setText("Já existe um delegado registrado, remova o existente se for o caso e tente novamente.");
        }
    }

}
