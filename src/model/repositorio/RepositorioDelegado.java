package model.repositorio;

import model.entidade.Delegado;
import model.exception.DelegadoInexistenteException;
import model.exception.DelegadoJaExisteException;

public class RepositorioDelegado {
    private Delegado delegado;
    private RepositorioArquivo repositorio;
    private String caminhoArquivo;

    public RepositorioDelegado() {
        this.repositorio = new RepositorioArquivo();
        this.caminhoArquivo = "repositorio\\delegado.dat";
        this. delegado = (Delegado) repositorio.lerObjeto(this.caminhoArquivo);
        if(this.delegado == null){
            this.repositorio.salvarObjeto(new Delegado(), this.caminhoArquivo);
            new RepositorioDelegado();
        }
    }

    public boolean cadastrarDelegado(Delegado delegado) throws DelegadoJaExisteException {
        this. delegado = (Delegado) repositorio.lerObjeto(this.caminhoArquivo);
        if( this.delegado.getNome() != null){
            throw new DelegadoJaExisteException(delegado);
        }
        this.repositorio.salvarObjeto(delegado, this.caminhoArquivo);
        return true;
    }

    public void removerDelegado() throws DelegadoInexistenteException {
        this. delegado = (Delegado) repositorio.lerObjeto(this.caminhoArquivo);
        if (this.delegado.getNome() != null) {
            this.repositorio.salvarObjeto(new Delegado(), this.caminhoArquivo);
        } else {
            throw new DelegadoInexistenteException();
        }
    }

    public boolean modificarDelegado(Delegado delegado) throws DelegadoInexistenteException {
        this. delegado = (Delegado) repositorio.lerObjeto(this.caminhoArquivo);
        if(this.delegado.getNome() != null){
            this.delegado.setNome(delegado.getNome());
            this.delegado.setSalario(delegado.getSalario());
            this.delegado.setPeriodoDaFuncao(delegado.getPeriodoDaFuncao());
            this.delegado.setCPF(delegado.getCPF());
            this.repositorio.salvarObjeto(delegado,this.caminhoArquivo);
            return true;
        }
        throw new DelegadoInexistenteException();

    }

    public Delegado mostrarDelegado() throws DelegadoInexistenteException {
        this. delegado = (Delegado) repositorio.lerObjeto(this.caminhoArquivo);
        if(this.delegado.getNome() != null){
            Delegado aux = this.delegado;
            return aux;
        }else{
            throw new DelegadoInexistenteException();
        }

    }
}
