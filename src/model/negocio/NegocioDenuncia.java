package model.negocio;

import model.entidade.Denuncia;
import model.exception.IdInexistenteException;
import model.exception.RepositorioVazioException;
import model.exception.TipoNaoConstaException;
import model.repositorio.RepositorioDenuncia;

import java.util.ArrayList;

public class NegocioDenuncia {
    private RepositorioDenuncia repositorioDenuncia;
    
    public NegocioDenuncia() {
        this.repositorioDenuncia = new RepositorioDenuncia();
    }
    
    public boolean adicionar(Denuncia denuncia) {
        this.repositorioDenuncia.cadastrarDenuncia(denuncia);
        return true;
    }
    
    public boolean remover(int id) throws IdInexistenteException {
        this.repositorioDenuncia.removerDenuncia(id);
        return true;
    }

    public Denuncia buscar(int id) throws IdInexistenteException {
        return this.repositorioDenuncia.retornarDenuncia(id);
    }
    public ArrayList<Denuncia> buscarPorTipo(String tipo) throws TipoNaoConstaException {
        return this.repositorioDenuncia.retornarDenunciaPorString(tipo);
    }

    public boolean atualizar(int id, Denuncia denuncia) throws IdInexistenteException {
        this.repositorioDenuncia.atualizarDenuncia(id, denuncia);
        return true;
    }

    public ArrayList<Denuncia> mostrarTodos() throws RepositorioVazioException {
        return this.repositorioDenuncia.retornarTodasDenuncias();
    }

    public void arquivar(int id) throws IdInexistenteException {
        this.repositorioDenuncia.arquivarDenuncia(id);
    }

    public void desarquivar(int id) throws IdInexistenteException {
        this.repositorioDenuncia.desarquivarOcorrencia(id);
    }
}