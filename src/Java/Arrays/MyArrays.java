package Java.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intarr = new int[10];
        System.out.println("Заполни массив чисел: ");
        for (int i = 0; i < intarr.length ; i++) {
            intarr[i] = Integer.parseInt(reader.readLine());
        }
        for (Integer i : intarr){
            System.out.print(i + " ");
        }

        System.out.println("\n" + "Заполни массив строк: ");
        String[] stringarr = new String[5];
        for (int i = 0; i < stringarr.length ; i++) {
            stringarr[i] = reader.readLine();
        }
        for (String s : stringarr){
            System.out.println(s);
        }

        String[] methodTwo = {"qwe", "asd", "zxc"};
        Integer[] integer = {1, 2, 3, 4, 5};
        int[] itn = {11, 22, 33, 44, 55};


//      Многомерные массивы
        int[][] dm = new int[2][4];
        System.out.println("Заполните массив данными: ");

//      1 вариант
        for (int i = 0; i < dm.length; i++) {
            for (int j = 0; j < dm[i].length; j++) {
                dm[i][j] = Integer.parseInt(reader.readLine());
            }
        }

        for (int i = 0; i < dm.length; i++) {
            for (int j = 0; j < dm[i].length; j++) {
                System.out.print(dm[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//      2 вариант
//        for (int[] i : dm) {
//            for (int j = 0; j < 4; j++) {
//                i[j] = Integer.parseInt(reader.readLine());
//            }
//        }
//
//        for (int[] i : dm) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(i[j] + " ");
//            }
//            System.out.println();
//        }

//      3 вариант
        int[][] second = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[i].length; j++) {
                System.out.print(second[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//      4 вариант
        Object[][] secondTwo = {
                {1,2,3,4,5,7},
                {7,"",null},
                {7,123," ",123,"ola","hello"}
        };
        for (int i = 0; i < secondTwo.length; i++) {
            for (int j = 0; j < secondTwo[i].length; j++) {
                System.out.print(secondTwo[i][j] + " ");
            }
            System.out.println();
        }


    }
}
