package model.entidade;
/*
 * Muito parecido com o delegado, com a diferenзa de 'String funcao', que irб indicar qual a funзгo
 * que o funcionбrio estб exercendo dentro da unidade.
 */
public class Funcionario extends PessoaFisica{
    private String funcao;
    private String periodoDaFuncao;
    private String salario;

    public Funcionario(String funcao, String periodoDaFuncao, String salario, String nome, String CPF) {
        super(nome, CPF );
        this.salario = salario;
        this.funcao = funcao;
        this.periodoDaFuncao = periodoDaFuncao;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getPeriodoDaFuncao() {
        return periodoDaFuncao;
    }

    public void setPeriodoDaFuncao(String periodoDaFuncao) {
        this.periodoDaFuncao = periodoDaFuncao;
    }

    public static boolean verificarSalario(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Funcionario:" +
                "\nNome: "+ getNome()+
                "\nCPF: "+ getCPF() +
                "\nSalario: "+ this.salario +
                "\nFuncao: " + this.funcao +
                "\nPeriodo da Funcao: " + this.periodoDaFuncao ;
    }
}
