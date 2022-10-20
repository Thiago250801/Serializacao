package testes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import model.Cidade;
import model.Estado;

public class TestaSerializarObjetos {

    public static void main(String[] args)  {


        List<String> cidadesAm = new ArrayList<>();
        cidadesAm.add("Manaus");
        cidadesAm.add("Borba");
        cidadesAm.add("Iranduba");

        Estado estadoAm =new Estado("Amazonas","AM", cidadesAm );


        List<String> cidadesSp = new ArrayList<>();
        cidadesSp.add("Santos");
        cidadesSp.add("Campinas");
        cidadesSp.add("Sao Paulo");

        Estado estadoSp = new Estado("Sao Paulo", "SP", cidadesSp);

        Cidade cidadeAm =new Cidade("Manaus",estadoAm);
        Cidade cidadeSp = new Cidade("Sao Paulo", estadoSp);

    try (FileOutputStream saida = new FileOutputStream("cidade.dat");
         ObjectOutputStream serializador = new ObjectOutputStream(saida)) {

        serializador.writeObject(cidadeAm);
        serializador.writeObject(cidadeSp);

        System.out.println("Objeto serializado!");

    }catch(IOException e){
        System.out.printf("Ocorreu um problem no processo de serialização. Erro:"+e.getMessage());
    }finally{
        System.out.println("Fim do Processo.");
    }




    }

}
