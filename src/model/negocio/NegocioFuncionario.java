package model.negocio;

import model.entidade.Funcionario;
import model.entidade.Pessoa;
import model.exception.*;
import model.repositorio.RepositorioFuncionario;

import java.util.ArrayList;

public class NegocioFuncionario {
    private RepositorioFuncionario repositorioFuncionario;

    public NegocioFuncionario() {
        this.repositorioFuncionario = new RepositorioFuncionario();
    }

    public boolean adicionar(Funcionario funcionario) throws CPFJaExisteException, CPFInvalidoException, SalarioInvalidoException {
        if(!Pessoa.verificarCodigo(funcionario.getCPF())){
            throw new CPFInvalidoException(funcionario.getCPF());
        }
        if(!Funcionario.verificarSalario(funcionario.getSalario())){
            throw new SalarioInvalidoException();
        }
        this.repositorioFuncionario.cadastrarFuncionario(funcionario);
        return true;
    }

    public boolean remover(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        this.repositorioFuncionario.removerFuncionario(cpf);
        return true;
    }

    public Funcionario buscar(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        return this.repositorioFuncionario.buscarFuncionario(cpf);
    }

    public boolean atualizar(String cpf, Funcionario funcionario) throws CPFInexistenteException, SalarioInvalidoException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(funcionario.getCPF())){
            throw new CPFInvalidoException(funcionario.getCPF());
        }
        if(!Funcionario.verificarSalario(funcionario.getSalario())){
            throw new SalarioInvalidoException();
        }
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        this.repositorioFuncionario.alterarFuncionario(cpf, funcionario);
        return true;
    }

    public ArrayList<Funcionario> mostrarTodos() throws RepositorioVazioException {
        return this.repositorioFuncionario.mostrarTodosFuncionarios();
    }
}
