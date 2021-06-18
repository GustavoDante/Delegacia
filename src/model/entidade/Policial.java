package model.entidade;

/*
 * Entidade polical, onde existem as variбveis 'String periodoDaFuncao' que diz qual o turno de
 * trabalho do policial e 'String salario', que diz o salбrio desse policial.
 */
public class Policial extends PessoaFisica{
    private String periodoDaFuncao;
    private String salario;

    public Policial(String nome, String salario, String periodoDaFuncao, String CPF) {
        super(nome, CPF);
        this.periodoDaFuncao = periodoDaFuncao;
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSlario(String salario) {
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
        return "\nPolicial:" +
                "\nNome: " + getNome()+
                "\nCPF: " + getCPF()+
                "\nSalario: " +this.salario+
                "\nPeriodoDaFuncao: " + this.periodoDaFuncao ;
    }
}
