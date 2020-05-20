package Serialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        Serialization[] serarr = {
                new Serialization(1,"Vlad"),
                new Serialization(2,"Vova") ,
                new Serialization(3,"Misha"),
                new Serialization(4,"Dima")
        };
        try (ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream(Serialization.file))){

//          Считываем по 1 элементу в массиве
//            oos.writeInt(serarr.length);
//            for (Serialization ser : serarr){
//                oos.writeObject(ser);
//            }

//          Считываем массив
            oos.writeObject(serarr);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
