package MapList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapList {

    public static void main(String[] args) {

        Map<Integer, String> karta = new HashMap<>();
        karta.put(1, "Russia");
        karta.put(2, "USA");
        karta.put(3, "Canada");
        karta.put(0, "Belarus");
        karta.put(-1, "Litva");
        karta.put(10, "Ukraine");
        System.out.println(karta.get(10));
        System.out.println(karta.get(7));
        System.out.println();

        karta.forEach((k,v) -> System.out.println(k + " - " + v));


        System.out.println("Karta contains key 2: " + karta.containsKey(2));
        System.out.println("Karta contains key 8: " + karta.containsKey(8));
        System.out.println("Karta contains value USA: " + karta.containsValue("USA"));
        System.out.println("Karta contains key Moldova: " + karta.containsValue("Moldova") + "\n");


        // Пройтись по всем значениям в Map #Способ_1 - Map.Entry, entrySet
        for (Map.Entry<Integer,String> read : karta.entrySet()) {
            System.out.println("Id: " + read.getKey() + " " + "Страна: " + read.getValue());
        }
        System.out.println();


        // Пройтись по всем значениям в Map #Способ_2 - Map.Entry, entrySet
        for(Map.Entry entry: karta.entrySet()) {
            int it = Integer.parseInt(entry.getKey().toString());
            Object obj = entry.getKey();
            String value = entry.getValue().toString();
            System.out.println("Int: " + it + "   " + "Obj: " + obj + "   " + "Value: " + value);
        }
        System.out.println();


        // Пройтись по всем значениям в Map #Способ_3 - Iterator
        Iterator<Map.Entry<Integer, String>> itr = karta.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry list = itr.next();
            System.out.println("Id: " + list.getKey() + " " + "Страна: " + list.getValue());
        }
        System.out.println();


        // Пройтись по всем значениям в Map #Способ_4 - key.Set()
        for (Integer key : karta.keySet()){
            System.out.println("Id = " + key + ", Страна = " +  karta.get(key));
        }

        System.out.println();
        System.out.println(karta.size());
        karta.clear();
        System.out.println(karta.size());

    }

}
