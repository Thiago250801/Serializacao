package testes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Cidade;
import model.Estado;

public class TestaSerializarObjetos {

    public static void main(String[] args)  {

        Estado estado1=new Estado("Amazonas","AM");

        Cidade cidade1=new Cidade("Manaus",estado1);

    try (FileOutputStream saida = new FileOutputStream("cidade.dat");
         ObjectOutputStream serializador = new ObjectOutputStream(saida)) {

        serializador.writeObject(cidade1);

        System.out.println("Objeto serializado!");

    }catch(IOException e){
        System.out.printf("Ocorreu um problem no processo de serialização. Erro:"+e.getMessage());
    }finally{
        System.out.println("Fim do Processo.");
    }




    }

}
