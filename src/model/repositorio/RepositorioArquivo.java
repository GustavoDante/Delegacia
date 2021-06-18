package model.repositorio;

import java.io.*;
import java.util.ArrayList;

public class RepositorioArquivo {
    private FileOutputStream file;
    private ObjectOutputStream os;
    private FileInputStream file2;
    private ObjectInputStream is;

    public RepositorioArquivo() {
    }
    
    public boolean salvar(ArrayList objeto, String caminhoArquivo){
        try{
            this.file = new FileOutputStream(caminhoArquivo);
            this.os = new ObjectOutputStream(this.file);
            this.os.writeObject(objeto);
            this.os.close();
            return true;
        }catch(IOException e){
            e.getStackTrace();
            return false;
        }
    }
    
    public boolean salvarObjeto(Object objeto, String caminhoArquivo){
        try{
            this.file = new FileOutputStream(caminhoArquivo);
            this.os = new ObjectOutputStream(this.file);
            this.os.writeObject(objeto);
            this.os.close();
            return true;
        }catch(IOException e){
            e.getStackTrace();
            return false;
        }
    }
    
    public ArrayList ler(String caminhoArquivo) throws IOException, ClassNotFoundException{
        this.file2 = new FileInputStream(caminhoArquivo);
        this.is = new ObjectInputStream(this.file2);
        ArrayList array = (ArrayList) this.is.readObject();
        return array;
    }
    
    public Object lerObjeto(String caminhoArquivo){
        try{
            this.file2 = new FileInputStream(caminhoArquivo);
            this.is = new ObjectInputStream(this.file2);
            Object objeto = this.is.readObject();
            return objeto;
        }catch(Exception e){
            e.getStackTrace();
            return null;
        }
    }
}