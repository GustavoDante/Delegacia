package model.entidade;

import java.io.Serializable;
/*
 * Entidade de denъncia, ou boletim de ocorrкncia. Aqui inicializam as variбveis para o registro
 * do BO no sistema. A variбvel 'boolean resolvido' й um boolean que diz se o BO estб resolvido ou nгo, o
 * 'String tipo' indica qual a natureza da denъncia, 'String boletim' й o detalhamento da denъncia,
 * 'String enderecoCompleto' й o endereзo no qual ocorreu a razгo da denъncia, 'Pessoa pessoa' estб
 * herdando da classe Pessoa (Nome completo) para o registro do BO e 'Pessoa Denunciado' й quando
 * o cidadгo que estб denunciando quer denunciar alguйm especнfico, ai insere os dados dessa pessoa.
 */

public class Denuncia implements Serializable{
    private boolean resolvido;
    private int id;
    private String tipo;
    private String boletim;
    private String enderecoCompleto;
    private Pessoa pessoa;
    private Pessoa denunciado;

    public Denuncia(String tipo, String boletim, String enderecoCompleto, Pessoa denunciado) {
        this.resolvido = false;
        this.tipo = tipo;
        this.boletim = boletim;
        this.enderecoCompleto = enderecoCompleto;
        this.denunciado = denunciado;
    }

    public Denuncia(String tipo, String boletim, String enderecoCompleto) {
        this.resolvido = false;
        this.tipo = tipo;
        this.boletim = boletim;
        this.enderecoCompleto = enderecoCompleto;
    }

    public Denuncia(Pessoa pessoa, String boletim, String enderecoCompleto, String tipo, Pessoa denunciado) {
        this.resolvido = false;
        this.tipo = tipo;
        this.boletim = boletim;
        this.enderecoCompleto = enderecoCompleto;
        this.pessoa = pessoa;
        this.denunciado = denunciado;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getCodigo(){
        return pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getResolvido() {
        return resolvido;
    }

    public void setResolvido(boolean indice) {
        this.resolvido = indice;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getBoletim() {
        return boletim;
    }

    public void setBoletim(String boletim) {
        this.boletim = boletim;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    @Override
    public String toString() {
        return "\nBoletimOcorrencia:" + '\n' +
                "Id=" + this.id + '\n' +
                ", Tipo= " + this.tipo + '\n' +
                ", Boletim= " + this.boletim + '\n' +
                ", EnderecoCompleto= " + this.enderecoCompleto +'\n'+
                ", Resolvido= "+ this.resolvido + '\n' +
                ", Denuncia feita por: "+ this.getCodigo()+ '\n'+
                ", Informações do denunciado: "+this.denunciado+'\n';
    }
}
