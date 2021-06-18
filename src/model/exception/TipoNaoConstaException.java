package model.exception;
// Caso o tipo da denъncia nгo esteja de acordo com os tipos listados no sistema.
public class TipoNaoConstaException extends Exception {

    public TipoNaoConstaException() {
        super("Esse tipo de denuncia não consta no sistema");
    }
}
