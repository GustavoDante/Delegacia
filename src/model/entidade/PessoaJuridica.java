package model.entidade;

/*
 * Entidade PessoaJuridica, que funciona quando na hora do registro de um BO, a pessoa й uma pessoa
 * jurнdica e informa o CNPJ no registro da denъncia.
 */

public class PessoaJuridica extends Pessoa{
    private String CNPJ;

    public PessoaJuridica(String nome, String CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String getCodigo() {
        return CNPJ;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                '}';
    }

}
