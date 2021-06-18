package model.exception;
// Quando for fazer a busca de um delegado, se nгo possuir nenhum cadastrado, a exceзгo serб executada.
public class DelegadoInexistenteException extends Exception{

    public DelegadoInexistenteException() {
        super("Delegado já não existe");
    }
}
