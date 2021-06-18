
package model.exception;
/* A exceзгo serб executada quando na busca por CNPJ, nгo tenha nenhum cadastrado que
   seja igual ao digitado na realizaзгo da busca.*/

public class CNPJInexistenteException extends Exception{
    
    public CNPJInexistenteException(String cnpj) {
        super("CNPJ não consta no sistema, verifique o CNPJ e tente novamente!");
    }
        
}
