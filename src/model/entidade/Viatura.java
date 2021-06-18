package model.entidade;

import java.io.Serializable;
/*
 * Entidade viatura, representada pelas variбveis 'String tipo' que indica o tipo, 'String placa' que
 * informa a placa do carro, 'String ano' que diz o ano de fabricaзгo do carro, podendo usar para
 * solicitar novos modelos, caso estejam defasados.
 */
public class Viatura implements Serializable {
    private String tipo;
    private String placa;
    private String ano;
    private int id;

    public Viatura(String placa, String ano, String tipo) {
        this.tipo = tipo;
        this.placa = placa;
        this.ano =ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nViatura:" +
                "\nPlaca: " + this.placa +
                "\nId: " + this.id +
                "\nTipo: "+ this.tipo+
                "\nAno: "+ this.ano;
    }
}
