package model.entidade;

/*
 * Entidade onde inicializa-se as variбveis do Detento. 'int cela' й a cela que ele irб se alocar,
 * 'String delito' й qual o delito cometido por ele e 'String dataChegada' й a data da chegada do
 * detento.
 */
public class Detento extends PessoaFisica{
    private int cela;
    private String delito;
    private String dataChegada;

    public Detento(String nome, String CPF, String delito, String dataChegada) {
        super(nome, CPF);
        this.delito = delito;
        this.dataChegada = dataChegada;

    }

    public int getCela() {
        return cela;
    }

    public void setCela(int cela) {
        this.cela = cela;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    @Override
    public String toString() {
        return "\nDetento:" +
                "\nNome:"+ getNome()+
                "\nCPF:"+ getCPF()+
                "\nCela:"+ getCela()+
                "\nDelito:" + this.delito +
                "\ndataChegada:" + this.dataChegada;
    }
}
