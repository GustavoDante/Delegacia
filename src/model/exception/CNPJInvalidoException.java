package model.exception;
/* Exceзгo serб executada quando o usuбrio for realizar uma busca ou registrar um BO e o CNPJ seja
 * invбlido, como por exemplo, o usuбrio digite alguma letra.
 */

public class CNPJInvalidoException extends Exception{

    public CNPJInvalidoException(String cnpj) {
        super("CNPJ digitado não é valido!");
    }
}
