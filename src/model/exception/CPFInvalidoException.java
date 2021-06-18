package model.exception;
/* Exceзгo serб executada quando o usuбrio for realizar uma busca ou registrar um BO e o CPF seja
 * invбlido, como por exemplo, o usuбrio digite alguma letra.
 */
public class CPFInvalidoException extends Exception{

    public CPFInvalidoException(String cpf) {
        super("Cpf Digitado não é valido!");
    }
}
