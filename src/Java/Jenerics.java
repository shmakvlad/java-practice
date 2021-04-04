package Java;

import java.util.ArrayList;
import java.util.Date;

public class Jenerics {
    public static void main(String[] args) {
        ArrayList animals = new ArrayList();
        animals.add("Nosorog");
        animals.add("Krofodil");
        animals.add("Slon");
        animals.add(123);
        animals.add(new Date());

        String s = (String) animals.get(0);
        Object s1 = animals.get(0);
//        String s2 = animals.get(0);

        ArrayList<String> list2 = new ArrayList();
        list2.addAll(animals);
//        list2.add(File);

    }
}
