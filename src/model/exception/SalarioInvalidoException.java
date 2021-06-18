package model.exception;
// Caso a entrada no salбrio esteja invбlida, como uma letra no valor, por exemplo.
public class SalarioInvalidoException extends Exception{

    public SalarioInvalidoException() {
        super("Salario digitado nao é valido! digite apenas numeros");
    }
}
