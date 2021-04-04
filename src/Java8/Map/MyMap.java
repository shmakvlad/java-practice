package Java8.Map;

import java.util.*;

public class MyMap {

    public static void main(String[] args) {

        Map<Integer, String> ls = new HashMap<>();
        ls.put(1, "Russia");
        ls.put(2, "USA");
        ls.put(3, "Canada");
        ls.put(0, "Belarus");
        ls.put(10, "Ukraine");
        System.out.println("Первый элемент коллекции map: " + ls.get(2));
        System.out.println();

        for (Map.Entry read : ls.entrySet()){
            System.out.println("Key: " + read.getKey() + " " + "Value: " + read.getValue());
        }
        System.out.println();


        for (Integer i : ls.keySet()){
            System.out.println(i + " " + ls.get(i));
        }
        System.out.println();


        Set<Integer> list = ls.keySet();
        for (Object read : list){
            System.out.println( read + " " + ls.get(read));
        }
        System.out.println();


        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(ls.get(iter.next()));
        }
        System.out.println();


        Iterator<Map.Entry<Integer,String>> mapiter = ls.entrySet().iterator();
        while (mapiter.hasNext()){
            Map.Entry get = mapiter.next();
            System.out.println(get.getKey() + " " + get.getValue());
        }
        System.out.println();

        ls.put(2, "Australia");
        System.out.println("Второй элемент коллекции map: " + ls.get(2));
        System.out.println();

        Map<String,String> str = new HashMap<>();
        str.put("1","A");
        str.put("2","B");
        str.put("3","C");
        str.put("4","D");
        str.put("5","E");
        for (String i : str.keySet()){
            System.out.println(i + " " + str.get(i));
        }

    }

}
