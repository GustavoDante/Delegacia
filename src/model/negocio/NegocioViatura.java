package model.negocio;

import model.entidade.Viatura;
import model.exception.IdInexistenteException;
import model.exception.RepositorioVazioException;
import model.repositorio.RepositorioViatura;

import java.util.ArrayList;

public class NegocioViatura {
    private RepositorioViatura repositorioViatura;

    public NegocioViatura(){
        this.repositorioViatura = new RepositorioViatura();
    }

    public boolean adicionar(Viatura viatura){
        this.repositorioViatura.cadastrarViatura(viatura);
        return true;
    }

    public boolean remover(int id) throws IdInexistenteException {
        this. repositorioViatura.removerViatura(id);
        return true;
    }

    public Viatura buscar(int id) throws IdInexistenteException {
        return this.repositorioViatura.buscarViatura(id);
    }

    public boolean atualizar(int id, Viatura viatura) throws IdInexistenteException {
        this.repositorioViatura.atualizarViatura(id, viatura);
        return true;
    }

    public ArrayList<Viatura> mostrarTodos()throws RepositorioVazioException {
        return this.repositorioViatura.mostrarTodasViaturas();
    }
}

