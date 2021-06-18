package model.entidade;

/*
 * Entidade PessoaFisica, que funciona quando na hora do registro de um BO, a pessoa й uma pessoa
 * fнsica e informa o CPF no registro da denъncia.
 */

public class PessoaFisica extends Pessoa{
    private String CPF;

    public PessoaFisica() {
    }
    public PessoaFisica(String nome) {
        super(nome);
    }
    public PessoaFisica(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getCodigo() {
        return this.CPF;
    }

    @Override
    public String toString() {
        return  "\nNome:" + getNome() +
                "\nCPF='" + this.CPF + '\''
                + '}';
    }


}
