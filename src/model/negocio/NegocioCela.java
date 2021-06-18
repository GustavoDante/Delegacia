package model.negocio;

import model.entidade.Celas;
import model.entidade.Detento;
import model.entidade.Pessoa;
import model.exception.*;
import model.repositorio.RepositorioCela;

import java.util.ArrayList;

public class NegocioCela {
    private RepositorioCela repositorioCela;

    public NegocioCela(Celas celas) {
        repositorioCela = new RepositorioCela(celas);
    }

    public NegocioCela() {
        repositorioCela = new RepositorioCela();
    }

    public boolean adicionar(Detento detento)throws CelasCheiasException, CPFJaExisteException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(detento.getCPF())){
            throw new CPFInvalidoException(detento.getCPF());
        }
        this.repositorioCela.adicionarDetento(detento);
        return true;
    }

    public boolean remover(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        this.repositorioCela.removerDetento(cpf);
        return true;
    }

    public Detento buscar(String cpf) throws CPFInexistenteException,  CPFInvalidoException {
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        return this.repositorioCela.buscarPreso(cpf);
    }

    public boolean atualizar(String cpf, Detento detento) throws CPFInexistenteException, CPFInvalidoException {
        if(!Pessoa.verificarCodigo(detento.getCPF())){
            throw new CPFInvalidoException(detento.getCPF());
        }
        if(!Pessoa.verificarCodigo(cpf)){
            throw new CPFInvalidoException(cpf);
        }
        this.repositorioCela.alterarDetento(cpf, detento);
        return true;
    }

    public ArrayList<ArrayList<Detento>> mostrarTodos() throws RepositorioVazioException {
        return this.repositorioCela.mostrarTodos();
    }

    public void alterarVagasECelas(Celas celas) {
        new RepositorioCela(celas);
    }

    public Celas retornarCelas(){
        return repositorioCela.retornarCela();
    }
}
