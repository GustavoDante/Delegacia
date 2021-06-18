package model.exception;
// Executada quando for realizar uma busca por ID e o mesmo nгo constar no sistema.
public class IdInexistenteException extends Exception{

    public IdInexistenteException(int id) {
        super("Id não consta no sistema, verifique o id digitado e tente novamente");

    }
}
