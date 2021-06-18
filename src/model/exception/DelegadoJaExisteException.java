package model.exception;

import model.entidade.Delegado;
/* O sistema permite apenas um delegado cadastrado no sistema, entгo quando o usuбrio tentar cadastrar
 * ma de um delegado, a exceзгo serб executada.
 */
public class DelegadoJaExisteException extends Exception {

    public DelegadoJaExisteException(Delegado delegado) {
        super("Ja existe um delegado cadastrado, se deseja cadastrar outro, remova primeiro o existente");
    }
}
