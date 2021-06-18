package model.entidade;

import java.io.Serializable;
/*
 * Entidade responsбvel pelas celas, inicializando as variбveis vagasCelas, que indica o nъmero de vagas
 * em cada cela e a variбvel numCelas, que indica quantas celas a unidade tem.
 */
public class Celas implements Serializable {
    private int vagasCelas;
    private int numCelas;

    public Celas(int vagasCelas, int numCelas) {
        this.vagasCelas = vagasCelas;
        this.numCelas = numCelas;
    }

    public int getVagasCelas() {
        return vagasCelas;
    }

    public void setVagasCelas(int vagasCelas) {
        this.vagasCelas = vagasCelas;
    }

    public int getNumCelas() {
        return numCelas;
    }

    public void setNumCelas(int numCelas) {
        this.numCelas = numCelas;
    }
}
