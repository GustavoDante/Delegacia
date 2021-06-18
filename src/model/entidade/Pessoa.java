package model.entidade;

import java.io.Serializable;
/*
 * Superclasse Pessoa, onde Delegado, Funcionбrio, Detento, Policial, PessoaFisica e PessoaJuridica
 * irгo herdar seus atributos.
 */

public abstract class Pessoa implements Serializable{
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getCodigo();

    public static boolean verificarCodigo(String str){
        try{
            Long.parseLong(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

}