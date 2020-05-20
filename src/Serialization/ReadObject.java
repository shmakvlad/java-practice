package Serialization;


import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Serialization.file))) {

//          Считываем по 1 элементу в массиве
//            int x = ois.readInt();
//            for (int i = 0; i < x; i++) {
//                Serialization ser = (Serialization) ois.readObject();
//                System.out.println(ser);
//            }

//          Считываем массив 1 вариант
//            Serialization[] ser = (Serialization []) ois.readObject();
//            System.out.print2ln(Arrays.toString(ser));

//          Считываем массив 2 вариант
            for (Serialization sss : (Serialization []) ois.readObject()){
                System.out.println(sss);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
