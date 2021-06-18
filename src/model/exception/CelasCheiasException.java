package model.exception;

import model.entidade.Detento;
// A exceзгo serб executada caso nгo existam mais vagas nas celas da delegacia.
public class CelasCheiasException extends Exception{

    public CelasCheiasException(Detento det){
        super("Todas as celas desta delegacia estão cheias, atualize os dados ou realize a transferencia do detento!");
    }
}
