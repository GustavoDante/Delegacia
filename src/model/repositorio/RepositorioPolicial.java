package model.repositorio;

import model.entidade.Policial;
import model.exception.CPFInexistenteException;
import model.exception.CPFJaExisteException;
import model.exception.RepositorioVazioException;

import java.io.*;
import java.util.ArrayList;

public class RepositorioPolicial {
    private ArrayList<Policial> array;
    private ArrayList<Policial> aux;
    private int i;
    private String caminhoArquivo;
    private RepositorioArquivo repositorio;

    public RepositorioPolicial(){
        this.array =  new ArrayList<>();
        this.aux = new ArrayList<>();
        this.caminhoArquivo = ("repositorio\\policial.dat");
        this.repositorio = new RepositorioArquivo();
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioPolicial();
        }
    }

    public boolean cadastrarPolicial(Policial bo) throws CPFJaExisteException {
        try {
            if(buscarPolicial(bo.getCPF()) != null){
                throw new CPFJaExisteException(bo.getCPF());
            }
        } catch (CPFInexistenteException e) {
            this.array.add(bo);
            this.repositorio.salvar(this.array, this.caminhoArquivo);
        }
        return false;
    }

    public Policial buscarPolicial(String cpf) throws CPFInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
            for (i = 0; i < this.array.size(); i++) {
                if (this.array.get(i).getCPF().equals(cpf)) {
                    return array.get(i);
                }
            }
            throw new CPFInexistenteException(cpf);
    }

    public ArrayList<Policial> mostrarTodosPoliciais() throws RepositorioVazioException {
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

    public boolean alterarPolicial(String cpf, Policial policia) throws CPFInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
            for (i = 0; i < this.array.size(); i++) {
                if (this.array.get(i).getCPF().equals(cpf)) {
                    this.array.get(i).setPeriodoDaFuncao(policia.getPeriodoDaFuncao());
                    this.array.get(i).setSlario(policia.getSalario());
                    this.array.get(i).setNome(policia.getNome());
                    this.array.get(i).setCPF(policia.getCPF());
                    this.repositorio.salvar(this.array, this.caminhoArquivo);
                    return true;
                }
            }
            throw new CPFInexistenteException(cpf);
    }
    public boolean removerPolicial(String cpf) throws CPFInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getCPF().equals(cpf)) {
                this.array.remove(this.array.get(i));
                this.repositorio.salvar(this.array, this.caminhoArquivo);
                return true;
            }
        }
        throw new CPFInexistenteException(cpf);
    }

}