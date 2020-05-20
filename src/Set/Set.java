package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {

        HashSet newset = new HashSet();
        newset.add(10);
        newset.add(11);
        newset.add(15);
        newset.add("Hello World");
        newset.add(12);
        newset.add("Hello !");

        newset.add(12);
        newset.add("Hello World");

        Iterator get = newset.iterator();
        while (get.hasNext()){
            System.out.println(get.next());
        }
        newset.remove(12);
        newset.remove("Hello !");
        System.out.println();

        for (Object read : newset){
            System.out.println(read);
        }
        System.out.println();
        System.out.println(newset.contains(10));
        System.out.println(newset.contains(12));
        System.out.println();

        newset.clear();
        System.out.println(newset.size());

    }
}
