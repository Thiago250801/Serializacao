package testes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import model.Cidade;

public class TestaDesserializarObjetos {

    public static void main(String[] args) {

        try(FileInputStream entrada = new FileInputStream("cidade.dat");
            ObjectInputStream desserializador =new ObjectInputStream(entrada)){

            Cidade cidadesAm = (Cidade) desserializador.readObject();
            Cidade cidaadesSP = (Cidade) desserializador.readObject();

            System.out.println(cidadesAm);
            System.out.println(cidaadesSP);

        }catch(IOException | ClassNotFoundException e){

            System.out.printf("Ocorreu um problema ao desserializar o objeto. Erro:"+e.getMessage());

        } finally{
            System.out.println("Fim do Processo");
        }


    }

}
