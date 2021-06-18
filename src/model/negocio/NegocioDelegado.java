package model.negocio;

import model.entidade.Delegado;
import model.entidade.Funcionario;
import model.entidade.Pessoa;
import model.exception.CPFInvalidoException;
import model.exception.DelegadoInexistenteException;
import model.exception.DelegadoJaExisteException;
import model.exception.SalarioInvalidoException;
import model.repositorio.RepositorioDelegado;

public class NegocioDelegado {
    private RepositorioDelegado repositorioDelegado;


    public NegocioDelegado() {
        repositorioDelegado = new RepositorioDelegado();
    }

    public boolean adicionar(Delegado delegado) throws DelegadoJaExisteException, CPFInvalidoException, SalarioInvalidoException {
        if(!Pessoa.verificarCodigo(delegado.getCPF())){
            throw new CPFInvalidoException(delegado.getCPF());
        }
        if(!Funcionario.verificarSalario(delegado.getSalario())){
            throw new SalarioInvalidoException();
        }
        this.repositorioDelegado.cadastrarDelegado(delegado);
        return true;

    }

    public boolean remover() throws DelegadoInexistenteException{
        this.repositorioDelegado.removerDelegado();
        return true;

    }

    public boolean atualizar(Delegado delegado) throws CPFInvalidoException, SalarioInvalidoException, DelegadoInexistenteException {
        if(!Pessoa.verificarCodigo(delegado.getCPF())){
            throw new CPFInvalidoException(delegado.getCPF());
        }
        if(!Funcionario.verificarSalario(delegado.getSalario())){
            throw new SalarioInvalidoException();
        }
        this.repositorioDelegado.modificarDelegado(delegado);
        return true;
    }

    public Delegado mostrar() throws DelegadoInexistenteException{
        return this.repositorioDelegado.mostrarDelegado();
    }
}
