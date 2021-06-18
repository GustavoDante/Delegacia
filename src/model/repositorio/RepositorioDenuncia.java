package model.repositorio;

import model.entidade.Denuncia;
import model.exception.IdInexistenteException;
import model.exception.RepositorioVazioException;
import model.exception.TipoNaoConstaException;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RepositorioDenuncia {
    private ArrayList<Denuncia> array;
    private ArrayList<Denuncia> aux;
    private int i;
    private Random random;
    private String caminhoArquivo;
    private RepositorioArquivo repositorio;

    public RepositorioDenuncia(){
        this.array = new ArrayList<>();
        this.aux = new ArrayList<>();
        this.caminhoArquivo = "repositorio\\denuncia.dat";
        this.repositorio = new RepositorioArquivo();
        this.random = new Random();
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch(IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioDenuncia();
        }
    }

    public boolean cadastrarDenuncia(Denuncia bo) {
        try {
            while(retornarDenuncia(bo.getId()) != null){
                bo.setId(this.random.nextInt(this.array.size()+1));
            }
        } catch (IdInexistenteException e) {
            this.array.add(bo);
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            return true;
        }
        return false;
    }

    public Denuncia retornarDenuncia(int id) throws IdInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch(IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioDenuncia();
        }
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getId() == id) {
                return this.array.get(i);
            }
        }
        throw new IdInexistenteException(id);
    }

    public ArrayList<Denuncia> retornarDenunciaPorString(String tipo) throws TipoNaoConstaException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch(IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioDenuncia();
        }
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getTipo().equals(tipo)) {
                aux.add(array.get(i));
                return this.aux;
            }
        }
        throw new TipoNaoConstaException();
    }

    public ArrayList<Denuncia> retornarTodasDenuncias() throws RepositorioVazioException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch(IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioDenuncia();
        }
        if(this.array != null && this.array.size() != 0){
            this.aux = this.array;
            return this.aux;
        }
        throw new RepositorioVazioException();
    }


    public boolean removerDenuncia(int id) throws IdInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch(IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioDenuncia();
        }
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getId() == id) {
                this.array.remove(this.array.get(i));
                this.repositorio.salvar(this.array, this.caminhoArquivo);
                return true;
            }
        }
        throw new IdInexistenteException(id);
    }

    public boolean atualizarDenuncia(int id, Denuncia denuncia) throws IdInexistenteException {
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getId() == id) {
                this.array.get(i).setPessoa(denuncia.getCodigo());
                this.array.get(i).setResolvido(denuncia.getResolvido());
                this.array.get(i).setId(denuncia.getId());
                this.array.get(i).setBoletim(denuncia.getBoletim());
                this.array.get(i).setEnderecoCompleto(denuncia.getEnderecoCompleto());
                this.array.get(i).setTipo(denuncia.getTipo());
                this.repositorio.salvar(this.array, this.caminhoArquivo);
                return true;
            }
        }
        throw new IdInexistenteException(id);
    }

    public boolean arquivarDenuncia(int id) throws IdInexistenteException {
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getId() == id) {
                this.array.get(i).setResolvido(true);
                this.repositorio.salvar(this.array, this.caminhoArquivo);
                return true;
            }
        }
        throw new IdInexistenteException(id);
    }

    public boolean desarquivarOcorrencia(int id) throws IdInexistenteException {
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getId() == id) {
                this.array.get(i).setResolvido(false);
                this.repositorio.salvar(this.array, this.caminhoArquivo);
                return true;
            }
        }
        throw new IdInexistenteException(id);
    }

}