package model.exception;
/* Quando o usuбrio quiser a listagem de algo, dos funcionбrios, por exemplo, essa exceзгo serб executada
 * caso nгo exista nenhum funcionбrio cadastrado.
 */

public class RepositorioVazioException extends Exception {

    public RepositorioVazioException() {
        super("Nao há nada aqui para mostrar!");
    }
}
