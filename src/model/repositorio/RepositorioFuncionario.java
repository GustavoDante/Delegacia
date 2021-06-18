package model.repositorio;

import model.entidade.Funcionario;
import model.exception.CPFInexistenteException;
import model.exception.CPFJaExisteException;
import model.exception.RepositorioVazioException;

import java.io.*;
import java.util.ArrayList;

public class RepositorioFuncionario {
    private ArrayList<Funcionario> array;
    private ArrayList<Funcionario> aux;
    private int i;
    private String caminhoArquivo;
    private RepositorioArquivo repositorio;

    public RepositorioFuncionario() {
        this.array = new ArrayList<>();
        this.aux = new ArrayList<>();
        this.caminhoArquivo = ("repositorio\\funcionario.dat");
        this.repositorio = new RepositorioArquivo();
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
    }

    public boolean cadastrarFuncionario(Funcionario bo) throws CPFJaExisteException {
        try {
            if(buscarFuncionario(bo.getCPF()) != null){
                throw new CPFJaExisteException(bo.getCPF());
            }
        } catch (CPFInexistenteException e) {
            this.array.add(bo);
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            return true;
        }
        return false;
    }

    public Funcionario buscarFuncionario(String cpf) throws CPFInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getCPF().equals(cpf)) {
                return this.array.get(i);
            }
        }
        throw new CPFInexistenteException(cpf);
    }

    public ArrayList<Funcionario> mostrarTodosFuncionarios() throws RepositorioVazioException {
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

    public boolean removerFuncionario(String cpf) throws CPFInexistenteException {
        try {
            this.array = this.repositorio.ler(this.caminhoArquivo);
        } catch (IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
            new RepositorioFuncionario();
        }
        for (i = 0; i < array.size(); i++) {
            if (this.array.get(i).getCPF().equals(cpf)) {
                this.array.remove(this.array.get(i));
                this.repositorio.salvar(this.array, this.caminhoArquivo);
                return true;
            }
        }
        throw new CPFInexistenteException(cpf);
    }

    public boolean alterarFuncionario(String cpf, Funcionario funcionario) throws CPFInexistenteException {try {
        this.array = this.repositorio.ler(this.caminhoArquivo);
    } catch (IOException | ClassNotFoundException e) {
        this.repositorio.salvar(this.array, this.caminhoArquivo);
        new RepositorioFuncionario();
    }
        for (i = 0; i < this.array.size(); i++) {
            if (this.array.get(i).getCPF().equals(cpf)) {
                this.array.get(i).setNome(funcionario.getNome());
                this.array.get(i).setSalario(funcionario.getSalario());
                this.array.get(i).setPeriodoDaFuncao(funcionario.getPeriodoDaFuncao());
                this. array.get(i).setFuncao(funcionario.getFuncao());
                this.array.get(i).setCPF(funcionario.getCPF());
                this.repositorio.salvar(this.array, this.caminhoArquivo);
                return true;
            }
        }
        throw new CPFInexistenteException(cpf);        
    }

}

