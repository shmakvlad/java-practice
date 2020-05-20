package List;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {

        // ArrayList
        ArrayList list = new ArrayList();
        list.add(5);
        list.add("10");
        list.add(9);
        list.add(123312);
        list.add("Hello World");
        for( int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Размер массива: " + list.size() + "\n");

        // ArrayList (Integer | String | ...)
        ArrayList<Integer> massive = new ArrayList();
        massive.add(1);
        massive.add(12);
        massive.add(10);
        massive.add(123);
        massive.add(1234);
        for( int i = 0; i < massive.size(); i++){
            System.out.println(massive.get(i));
        }
        System.out.println("Размер массива: " + massive.size() + "\n");

        // List
        java.util.List<Integer> spisok = new ArrayList<>();
        spisok.add(10);
        spisok.add(123);
        spisok.add(Integer.parseInt("222"));
        spisok.add(Integer.valueOf("333"));
        for( int i = 0; i < spisok.size(); i++){
            System.out.println(spisok.get(i));
        }
        System.out.println("Размер массива: " + spisok.size() + "\n");

        // ArrayList фиксированный размер
        ArrayList<String> fix = new ArrayList<String>(5);
        System.out.println("Размер массива fix: " + fix.size() + "\n");
        fix.add( 0,"Vova");
        fix.add("Vlad");
        fix.add("10");
        fix.add("Dima");
        fix.add("Misha");
        fix.add("25");
        fix.add("44");
        System.out.println(fix.indexOf("44"));
        System.out.println(fix.indexOf("Vlad"));
        System.out.println(fix.indexOf("MAX")); // вернёт -1 если не найдеёт элемент
        System.out.println(fix.contains("Dima"));
        if (fix.contains("12")) System.out.println("Fix contains 12 string"); else System.out.println("Fix doesn't contains 12 string");
        if (fix.contains(12)) System.out.println("Fix contains 12 integer"); else System.out.println("Fix doesn't contains 12 integer");
        if (fix.contains("Vlad")) System.out.println("Fix contains Vlad "); else System.out.println("Fix doesn't contains Vlad");
        if (fix.contains("VLAD")) System.out.println("Fix contains VLAD "); else System.out.println("Fix doesn't contains VLAD");
        if (fix.contains("Roma")) System.out.println("Fix contains Roma "); else System.out.println("Fix doesn't contains Roma" + "\n");
        System.out.println(fix.get(0));
        System.out.println(fix.get(1));
        System.out.println(fix.get(4));
        System.out.println(fix.get(fix.indexOf("Misha")));
        System.out.println(fix.get(4).equals("Vlad"));
        System.out.println(fix.get(4).equals("Misha"));

        System.out.println("Размер массива fix: " + fix.size() + "\n");
        for( String person : fix){
            System.out.println(person);
        }
        System.out.println();

        System.out.println(fix.get(5));
        fix.set(5,"Hello World");
        System.out.println(fix.get(5));
        fix.remove("Hello World");
        fix.remove(3);
        System.out.println();

        System.out.println("Размер массива fix: " + fix.size());
        for( String person : fix){
            System.out.println(person);
        }
        System.out.println();

        //С помощью метода toArray() мы можем преобразовать список в массив объектов.
        Object[] peopleArray = fix.toArray();
        for(Object person : peopleArray){
            System.out.println(person);
        }
        System.out.println("Размер объекта peopleArray: " + peopleArray.length + "\n");

        String news = fix.toString();
        System.out.println("Размер массива news: " + news.length());
        System.out.println("news: " + news);
        String[] world = news.split(",");
        for (String element : world){
            System.out.println("element: " + element);
        }
        System.out.println();

        System.out.println(fix.isEmpty());
        fix.clear();
        System.out.println(fix.isEmpty());
        System.out.println("Размер массива fix: " + fix.size() + "\n");

        //ArrayList
        ArrayList set  = new ArrayList();
        set.add("Privet Mir");
        set.addAll(list); set.addAll(massive); set.addAll(fix); set.addAll(spisok);
        for (Object element : set){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Индекс: " + set.indexOf("Vlad"));
        System.out.println("Размер: " + set.size());
        System.out.println();

        set.removeAll(spisok); //удаляет не коллекцию, а элементы коллекции одного типа
        for (Object element : set){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Размер: " + set.size());
        System.out.println();

        System.out.println(set.containsAll(spisok));
        System.out.println(set.containsAll(fix));
        System.out.println();

        set.removeAll(fix);
        for (Object element : set){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Размер: " + set.size());

        System.out.println();
        System.out.println(set.containsAll(spisok));
        System.out.println(set.containsAll(fix));
        System.out.println(set.containsAll(massive));
        System.out.println(set.containsAll(list));
        System.out.println();

        ArrayList new_list = new ArrayList();
        new_list.add("Hello World");
        new_list.add(123);
        for (Object chtenie : new_list){
            System.out.println(chtenie);
        }
        System.out.println();
        System.out.println(new_list.get(1));
        System.out.println(new_list.get(0));

    }
}
