package model.exception;
// Caso o ID jб esteja cadastrado no sistema, essa exceзгo serб executada, nгo permitindo dois ID's iguais.
public class IdJaExisteException extends Exception{

    public IdJaExisteException(int id) {
        super("Erro no cadastro, esse mesmo Id ja existe no sistema, tente cadastrar novamente");
    }
}
