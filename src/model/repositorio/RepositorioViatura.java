package model.repositorio;

import model.entidade.Viatura;
import model.exception.IdInexistenteException;
import model.exception.RepositorioVazioException;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RepositorioViatura {
    private ArrayList<Viatura> array;
    private ArrayList<Viatura> aux;
    private int i;
    private Random random;
    private String caminhoArquivo;
    private RepositorioArquivo repositorio;
    
    public RepositorioViatura() {
        this.random = new Random();
        this.array = new ArrayList<>();
        this.aux = new ArrayList<>();
        this.caminhoArquivo = ("repositorio\\viatura.dat");
        this.repositorio = new RepositorioArquivo();
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioViatura();
        }
    }

    public boolean cadastrarViatura(Viatura viatura){
        try {
            while(buscarViatura(viatura.getId()) != null){
                viatura.setId(this.random.nextInt(this.array.size()+1));
            }
        } catch (IdInexistenteException e) {
            this.array.add(viatura);
            this.repositorio.salvar(this.array, this.caminhoArquivo);
        }
        return false;
    }

    public Viatura buscarViatura(int id) throws IdInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
        for (i = 0; i <this. array.size(); i++) {
            if (this.array.get(i).getId() == (id)) {
                return this.array.get(i);
            }
        }
        throw new IdInexistenteException(id);
    }

    public boolean atualizarViatura(int id, Viatura viatura) throws IdInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getId() == id) {
                this.array.get(i).setPlaca(viatura.getPlaca());
                this.array.get(i).setAno(viatura.getAno());
                this.array.get(i).setTipo(viatura.getTipo());
                return true;
            }
        }
        throw new IdInexistenteException(id);
    }
    public boolean removerViatura(int id) throws IdInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
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

    public ArrayList<Viatura> mostrarTodasViaturas() throws RepositorioVazioException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
        if(this.array != null && this.array.size() != 0){
            this.aux = this.array;
            return this.aux;
        }
        throw new RepositorioVazioException();
    }
}
