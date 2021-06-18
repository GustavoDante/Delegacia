package model.negocio;

import model.entidade.Funcionario;
import model.entidade.Pessoa;
import model.entidade.Policial;
import model.exception.*;
import model.repositorio.RepositorioPolicial;

import java.util.ArrayList;

public class NegocioPolicial {
    private RepositorioPolicial repositorioPolicial;

    public NegocioPolicial() {
        this.repositorioPolicial = new RepositorioPolicial();
    }

    public boolean adicionar(Policial policial) throws CPFJaExisteException, SalarioInvalidoException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(policial.getCPF())){
            throw new CPFInvalidoException(policial.getCPF());
        }
        if(!Funcionario.verificarSalario(policial.getSalario())){
            throw new SalarioInvalidoException();
        }
        this.repositorioPolicial.cadastrarPolicial(policial);
        return true;
    }

    public boolean remover(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        this.repositorioPolicial.removerPolicial(cpf);
        return true;
    }

    public Policial buscar(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        return this.repositorioPolicial.buscarPolicial(cpf);
    }

    public boolean atualizar(String cpf, Policial policial) throws CPFInexistenteException, CPFInvalidoException, SalarioInvalidoException {
        if(!Pessoa.verificarCodigo(policial.getCPF())){
            throw new CPFInvalidoException(policial.getCPF());
        }
        if(!Funcionario.verificarSalario(policial.getSalario())){
            throw new SalarioInvalidoException();
        }
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        this.repositorioPolicial.alterarPolicial(cpf, policial);
        return true;
    }

    public ArrayList<Policial> mostrarTodos() throws RepositorioVazioException {
        return this.repositorioPolicial.mostrarTodosPoliciais();
    }
}
