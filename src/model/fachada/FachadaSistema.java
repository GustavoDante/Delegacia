package model.fachada;

import model.entidade.*;
import model.exception.*;
import model.negocio.*;
import model.repositorio.RepositorioDenuncia;

import java.util.ArrayList;

public class FachadaSistema {
    private NegocioPolicial negocioPolicial;
    private NegocioDelegado negocioDelegado;
    private NegocioCela negocioCela;
    private NegocioDenuncia negocioDenuncia;
    private NegocioFuncionario negocioFuncionario;
    private NegocioViatura negocioViatura;
    private RepositorioDenuncia repositorioDenuncia;

    public FachadaSistema(Celas celas){
        this.negocioPolicial = new NegocioPolicial();
        this.negocioDelegado = new NegocioDelegado();
        this.negocioCela = new NegocioCela(celas);
        this.negocioDenuncia = new NegocioDenuncia();
        this.negocioFuncionario = new NegocioFuncionario();
        this.negocioViatura = new NegocioViatura();
        this.repositorioDenuncia = new RepositorioDenuncia();
    }

    public FachadaSistema(){
        this.negocioPolicial = new NegocioPolicial();
        this.negocioDelegado = new NegocioDelegado();
        this.negocioCela = new NegocioCela();
        this.negocioDenuncia = new NegocioDenuncia();
        this.negocioFuncionario = new NegocioFuncionario();
        this.negocioViatura = new NegocioViatura();
        this.repositorioDenuncia = new RepositorioDenuncia();
    }

    public boolean cadastrarDetento(Detento detento) throws CPFJaExisteException, CelasCheiasException, CPFInvalidoException {
        negocioCela.adicionar(detento);
            return true;
    }

    public boolean atualizarDetento(Detento detento, String cpf) throws CPFInexistenteException, CPFInvalidoException {
        negocioCela.atualizar(cpf, detento);
        return true;
    }

    public Detento buscarDetento(String cpf) throws CPFInexistenteException,CPFInvalidoException {
        return negocioCela.buscar(cpf);
    }

    public ArrayList<ArrayList<Detento>> exibirDetentos() throws RepositorioVazioException {
        return negocioCela.mostrarTodos();
    }

    public boolean removerDetento(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        negocioCela.remover(cpf);
        return true;

    }

    public boolean alterarVagasECelas(Celas celas){
        negocioCela.alterarVagasECelas(celas);
        return true;
    }

    public boolean cadastrarDelegado(Delegado delegado) throws DelegadoJaExisteException, CPFInvalidoException, SalarioInvalidoException {
        if(negocioDelegado.adicionar(delegado)){
            return true;
        }
        return false;
    }

    public boolean atualizarDelegado(Delegado delegado) throws CPFInvalidoException, SalarioInvalidoException, DelegadoInexistenteException {
        if(negocioDelegado.atualizar(delegado)){
            return true;
        }
        return false;
    }

    public Delegado exibirDelegado() throws DelegadoInexistenteException {
        return negocioDelegado.mostrar();
    }

    public Celas retornarCelas(){
        return negocioCela.retornarCelas();
    }

    public boolean removerDelegado() throws DelegadoInexistenteException {
        if(negocioDelegado.remover()){
            return true;
        }
        return false;
    }

    public boolean cadastrarDenuncia(Denuncia denuncia){
        negocioDenuncia.adicionar(denuncia);
        return true;
    }

    public boolean atualizarDenuncia(Denuncia denuncia, int id) throws IdInexistenteException{
       negocioDenuncia.atualizar(id, denuncia);
        return true;

    }

    public Denuncia buscarDenuncia(int id) throws IdInexistenteException{
        return negocioDenuncia.buscar(id);
    }

    public ArrayList<Denuncia> buscarDenunciaPorTipo(String tipo) throws TipoNaoConstaException {
        return negocioDenuncia.buscarPorTipo(tipo);
    }

    public ArrayList<Denuncia> exibirDenuncias() throws RepositorioVazioException {
        return negocioDenuncia.mostrarTodos();
    }

    public boolean arquivarDenuncia(int id) throws IdInexistenteException {
        return repositorioDenuncia.arquivarDenuncia(id);
    }

    public boolean desarquivarDenuncia(int id) throws IdInexistenteException {
        return repositorioDenuncia.desarquivarOcorrencia(id);
    }
    public boolean removerDenuncia(int id) throws IdInexistenteException{
        negocioDenuncia.remover(id);
        return true;

    }

    public boolean cadastrarFuncionario(Funcionario funcionario) throws CPFJaExisteException, CPFInvalidoException, SalarioInvalidoException {
        negocioFuncionario.adicionar(funcionario);
        return true;
    }

    public boolean atualizarFuncionario(Funcionario funcionario, String cpf) throws CPFInexistenteException, CPFInvalidoException, SalarioInvalidoException {
        negocioFuncionario.atualizar(cpf, funcionario);
        return true;
    }

    public Funcionario buscarFuncionario(String cpf) throws CPFInexistenteException, CPFInvalidoException {
       return negocioFuncionario.buscar(cpf);
    }

    public ArrayList<Funcionario> exibirFuncionarios() throws RepositorioVazioException {
        return negocioFuncionario.mostrarTodos();
    }

    public boolean removerFuncionario(String funcionario) throws CPFInexistenteException, CPFInvalidoException {
        negocioFuncionario.remover(funcionario);
        return true;
    }

    public boolean cadastrarPolicial(Policial policial) throws CPFJaExisteException, CPFInvalidoException, SalarioInvalidoException {
        negocioPolicial.adicionar(policial);
        return true;

    }

    public boolean atualizarPolicial(Policial policial, String cpf) throws CPFInexistenteException, CPFInvalidoException, SalarioInvalidoException {
        negocioPolicial.atualizar(cpf, policial);
        return true;
    }

    public Policial buscarPolicial(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        return negocioPolicial.buscar(cpf);
    }

    public ArrayList<Policial> exibirPoliciais() throws RepositorioVazioException {
        return negocioPolicial.mostrarTodos();
    }

    public boolean removerPoliciais(String cpf) throws CPFInexistenteException, CPFInvalidoException {
        negocioPolicial.remover(cpf);
        return true;

    }

    public boolean cadastrarViatura(Viatura viatura){
        negocioViatura.adicionar(viatura);
        return true;
    }

    public boolean atualizarViatura(Viatura viatura, int id) throws IdInexistenteException{
        if(negocioViatura.atualizar(id, viatura)){
            return true;
        }
        return false;
    }

    public Viatura buscarViatura(int id) throws IdInexistenteException {
        return negocioViatura.buscar(id);
    }

    public ArrayList<Viatura> exibirViaturas() throws RepositorioVazioException {
        return negocioViatura.mostrarTodos();
    }

    public boolean removerViatura(int id) throws IdInexistenteException {
        negocioViatura.remover(id);
        return true;
    }

}