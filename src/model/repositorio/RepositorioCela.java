package model.repositorio;

import model.entidade.Celas;
import model.entidade.Detento;
import model.exception.CPFInexistenteException;
import model.exception.CPFJaExisteException;
import model.exception.CelasCheiasException;
import model.exception.RepositorioVazioException;

import java.io.*;
import java.util.ArrayList;


public class RepositorioCela{
    private ArrayList<ArrayList<Detento>> array;
    private ArrayList<ArrayList<Detento>> aux;
    private int i,j;
    private final String caminhoArquivo;
    private final String caminhoArquivo2;
    private Celas celasInfo;
    private RepositorioArquivo repositorio;
    
    public RepositorioCela(Celas celas){
        this.caminhoArquivo = "repositorio\\celas.dat";
        this.caminhoArquivo2 = "repositorio\\infoCelas.dat";
        this.repositorio = new RepositorioArquivo();
        this.array =new ArrayList<>();
        this.celasInfo = new Celas(celas.getVagasCelas(), celas.getNumCelas());
        for(int i=0 ; i<celas.getNumCelas(); i++){
            this.array.add(new ArrayList<>());
        }
        try {
            this.repositorio.salvarObjeto(celas, this.caminhoArquivo2);
            if(this.repositorio.lerObjeto(caminhoArquivo2)==null){
                repositorio.salvarObjeto(celasInfo, caminhoArquivo2);
            }
            this.array = this.repositorio.ler(caminhoArquivo);
            if(this.array==null){
                this.array = new ArrayList<>();
                for(i=0 ; i<celasInfo.getNumCelas(); i++){
                    this.array.add(new ArrayList<>());
                }
                this.repositorio.salvar(this.array, this.caminhoArquivo);
            }
        } catch(IOException | ClassNotFoundException e) {
            repositorio.salvar(new ArrayList(), this.caminhoArquivo);
            new RepositorioCela(new Celas(celasInfo.getNumCelas(), celasInfo.getVagasCelas()));
            e.getStackTrace();
        }
    }

    public RepositorioCela(){
        this.caminhoArquivo = "repositorio\\celas.dat";
        this.caminhoArquivo2 = "repositorio\\infoCelas.dat";
        this.repositorio = new RepositorioArquivo();
        this.array =new ArrayList<>();
        try {
            this.celasInfo = (Celas) this.repositorio.lerObjeto(caminhoArquivo2);
            this.array = this.repositorio.ler(caminhoArquivo);
            if(this.array==null){
                this.array = new ArrayList<>();
                this.repositorio.salvarObjeto(this.array, this.caminhoArquivo);
            }
        } catch(IOException | ClassNotFoundException e) {
            this.repositorio.salvar(this.array, this.caminhoArquivo);
        }
    }

    public boolean adicionarDetento(Detento detento) throws CelasCheiasException, CPFJaExisteException {
        try {
            if(buscarPreso(detento.getCPF()) != null){
                throw new CPFJaExisteException(detento.getCPF());
            }
        } catch (CPFInexistenteException e) {
            for (i = 0; i < this.celasInfo.getNumCelas(); i++) {
                if (this.celasInfo.getVagasCelas() > this.array.get(i).size()) {
                    detento.setCela(i);
                    this.array.get(i).add(detento);
                    this.repositorio.salvar(this.array, this.caminhoArquivo);
                    return true;
                }
            }
            throw new CelasCheiasException(detento);
        }
        return false;
    }

    public boolean removerDetento(String cpf) throws CPFInexistenteException {
        try {
            this.repositorio.salvarObjeto(celasInfo, this.caminhoArquivo2);
            if(this.repositorio.lerObjeto(caminhoArquivo2)==null){
                repositorio.salvarObjeto(celasInfo, caminhoArquivo2);
            }
            this.array = this.repositorio.ler(caminhoArquivo);
            if(this.array==null){
                this.array = new ArrayList<>();
                for(i=0 ; i<celasInfo.getNumCelas(); i++){
                    this.array.add(new ArrayList<>());
                }
                this.repositorio.salvar(this.array, this.caminhoArquivo);
            }
        } catch(IOException | ClassNotFoundException e) {
            repositorio.salvar(new ArrayList(), this.caminhoArquivo);
            new RepositorioCela(new Celas(celasInfo.getNumCelas(), celasInfo.getVagasCelas()));
            e.getStackTrace();
        }
        for ( i = 0; i < this.array.size(); i++) {
            for ( j = 0; j < this.array.get(i).size(); j++) {
                if (cpf.equals(this.array.get(i).get(j).getCPF())) {
                    this.array.get(i).remove(this.array.get(i).get(j));
                    this.repositorio.salvar(this.array, this.caminhoArquivo);
                    return true;
                }
            }
        }
        throw new CPFInexistenteException(cpf);
    }

    public Detento buscarPreso(String cpf) throws CPFInexistenteException {
        try {
            this.repositorio.salvarObjeto(celasInfo, this.caminhoArquivo2);
            if(this.repositorio.lerObjeto(caminhoArquivo2)==null){
                repositorio.salvarObjeto(celasInfo, caminhoArquivo2);
            }
            this.array = this.repositorio.ler(caminhoArquivo);
            if(this.array==null){
                this.array = new ArrayList<>();
                for(i=0 ; i<celasInfo.getNumCelas(); i++){
                    this.array.add(new ArrayList<>());
                }
                this.repositorio.salvar(this.array, this.caminhoArquivo);
            }
        } catch(IOException | ClassNotFoundException e) {
            repositorio.salvar(new ArrayList(), this.caminhoArquivo);
            new RepositorioCela(new Celas(celasInfo.getNumCelas(), celasInfo.getVagasCelas()));
            e.getStackTrace();
        }
            for ( i = 0; i < this.array.size(); i++) {
                for ( j = 0; j < this.array.get(i).size(); j++) {
                    if (cpf.equals(this.array.get(i).get(j).getCPF())) {
                        return (this.array.get(i).get(j));
                    }
                }
            }
            throw new CPFInexistenteException(cpf);    
    }

    public boolean alterarDetento(String cpf, Detento detento) throws CPFInexistenteException {
        try {
            this.repositorio.salvarObjeto(celasInfo, this.caminhoArquivo2);
            if(this.repositorio.lerObjeto(caminhoArquivo2)==null){
                repositorio.salvarObjeto(celasInfo, caminhoArquivo2);
            }
            this.array = this.repositorio.ler(caminhoArquivo);
            if(this.array==null){
                this.array = new ArrayList<>();
                for(i=0 ; i<celasInfo.getNumCelas(); i++){
                    this.array.add(new ArrayList<>());
                }
                this.repositorio.salvar(this.array, this.caminhoArquivo);
            }
        } catch(IOException | ClassNotFoundException e) {
            repositorio.salvar(new ArrayList(), this.caminhoArquivo);
            new RepositorioCela(new Celas(celasInfo.getNumCelas(), celasInfo.getVagasCelas()));
            e.getStackTrace();
        }
        for ( i = 0; i < this.array.size(); i++) {
            for ( j = 0; j < this.array.get(i).size(); j++) {
                if (cpf.equals(this.array.get(i).get(j).getCPF())) {
                    this.array.get(i).get(j).setNome(detento.getNome());
                    this.array.get(i).get(j).setDataChegada(detento.getDataChegada());
                    this.array.get(i).get(j).setDelito(detento.getDelito());
                    this.array.get(i).get(j).setCPF(detento.getCPF());
                    this.repositorio.salvar(this.array,this.caminhoArquivo);
                    return true;
                }
            }
        }
        throw new CPFInexistenteException(cpf);
    }

    public ArrayList<ArrayList<Detento>> mostrarTodos() throws RepositorioVazioException {
        try {
            this.repositorio.salvarObjeto(celasInfo, this.caminhoArquivo2);
            if(this.repositorio.lerObjeto(caminhoArquivo2)==null){
                repositorio.salvarObjeto(celasInfo, caminhoArquivo2);
            }
            this.array = this.repositorio.ler(caminhoArquivo);
            if(this.array==null){
                this.array = new ArrayList<>();
                for(i=0 ; i<celasInfo.getNumCelas(); i++){
                    this.array.add(new ArrayList<>());
                }
                this.repositorio.salvar(this.array, this.caminhoArquivo);
            }
        } catch(IOException | ClassNotFoundException e) {
            repositorio.salvar(new ArrayList(), this.caminhoArquivo);
            new RepositorioCela(new Celas(celasInfo.getNumCelas(), celasInfo.getVagasCelas()));
            e.getStackTrace();
        }
        if(this.array != null && this.array.size() != 0){
            this.aux = this.array;
            return aux;
        }
        throw new RepositorioVazioException();
    }

    public Celas retornarCela(){
        try {
            this.repositorio.salvarObjeto(celasInfo, this.caminhoArquivo2);
            if(this.repositorio.lerObjeto(caminhoArquivo2)==null){
                repositorio.salvarObjeto(celasInfo, caminhoArquivo2);
            }
            this.array = this.repositorio.ler(caminhoArquivo);
            if(this.array==null){
                this.array = new ArrayList<>();
                for(i=0 ; i<celasInfo.getNumCelas(); i++){
                    this.array.add(new ArrayList<>());
                }
                this.repositorio.salvar(this.array, this.caminhoArquivo);
            }
        } catch(IOException | ClassNotFoundException e) {
            repositorio.salvar(new ArrayList(), this.caminhoArquivo);
            new RepositorioCela(new Celas(celasInfo.getNumCelas(), celasInfo.getVagasCelas()));
            e.getStackTrace();
        }
        Celas aux = celasInfo;
        return aux;
    }
}