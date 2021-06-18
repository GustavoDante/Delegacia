package model.entidade;


/*
 * Entidade do Delegado da unidade, onde a variбvel periodoDaFuncao indica o turno de trabalho e
 * a variбvel salбrio indica quanto o delegado ganha.
 */

public class Delegado extends PessoaFisica{
    private String periodoDaFuncao;
    private String salario;

    public Delegado() {
    }

    public Delegado(String nome, String salario, String periodoDaFuncao, String CPF) {
        super(nome, CPF);
        this.salario = salario;
        this.periodoDaFuncao = periodoDaFuncao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getPeriodoDaFuncao() {
        return periodoDaFuncao;
    }

    public void setPeriodoDaFuncao(String periodoDaFuncao) {
        this.periodoDaFuncao = periodoDaFuncao;
    }

    @Override
    public String toString() {
        return "Delegado:" +
                "\nNome: "+ getNome()+
                "\nCPF: "+ getCPF() +
                "\nSalario: "+ this.salario +
                "\nperiodo de trabalho: "+ this.periodoDaFuncao;
    }
}
