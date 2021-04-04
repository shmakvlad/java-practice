package Java8.List;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        System.out.println('\u0054');
        System.out.println('\u0074');

        ArrayList lenta = new ArrayList();
        ArrayList<String> lenta2 = new ArrayList();
        for(int i = 0; i < 10; i++){
            lenta.add(i * 2);
        }

        for(int i = 0; i < lenta.size(); i++){
            System.out.println(lenta.get(i));
        }
        lenta.add("Hello World!");
        lenta2.add("Hello World!");
        System.out.println();

        for(int i = 0; i < lenta.size(); i++){
            if (lenta.get(i).equals(4) || lenta.get(i).equals(10)){
                lenta.remove(i);
            }
        }
        System.out.println(lenta.toString());

        java.util.Iterator iter = lenta.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        lenta.add("Goodbye.");
        lenta2.add("Goodbye.");
        System.out.println();

        for (Object spisok : lenta){
            System.out.println(spisok);
        }

        for (String list : lenta2){
            System.out.println(list);
        }

        System.out.println();
        System.out.println("JavaRush");
        java.util.Iterator catIterator = lenta.iterator();
        while(catIterator.hasNext()) {
            Object ravno = catIterator.next();
            if (ravno.equals(14) || ravno.equals(0) || ravno.equals("Hello World!")){
                catIterator.remove();
            }
        }
        System.out.println();
        System.out.println(lenta.toString());
        System.out.println(lenta);
    }
}
