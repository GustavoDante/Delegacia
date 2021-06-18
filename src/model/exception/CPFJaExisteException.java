package model.exception;
/* Realizado quando o usuбrio for fazer algum cadastro no sistema e o CPF jб tenha sido
 * cadastrado anteriormente.
 */

public class CPFJaExisteException extends Exception {

    public CPFJaExisteException(String cpf) {
        super("O cpf digitado ja pertence a alguem cadastrado, por favor, verifique o cpf digitado!");
    }
}
