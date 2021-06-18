package model.exception;
// Quando for realizar uma busca por CPF e o CPF nгo constar no sistema essa exceзгo serб executada
public class CPFInexistenteException extends Exception{

    public CPFInexistenteException(String codigo) {
        super("CPF não consta no sistema, verifique o cpf e tente novamente!");

    }
}
