package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CopyArrayList {
    public static void main(String[] args) {

    // 1 - Collections.addAll
        String[] arrayOfStrings = {"5", "2", "3", "4"};
        ArrayList<String> listOfStrings = new ArrayList<String>();
        Collections.addAll(listOfStrings, arrayOfStrings);


    // 2 - Arrays.asList // Изменения в одном объекте отражаются в другом
        String[] arrayOfStrings1 = {"5", "2", "3", "4"};
        List listOfStrings1 = Arrays.asList(arrayOfStrings1);


    // 3 - Collections.copy // Destination ArrayList должен быть нужного размера
        ArrayList list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        ArrayList list = new ArrayList<Integer>(Arrays.asList(new Integer[3]));
        Collections.copy(list, list2);

    // 4- С помощью конструктора
        // 1
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("123"));

        // 2
        String[] arrayOfStrings2 = {"3", "2", "3", "4", "6"};
        ArrayList<String> listOfStrings2 = new ArrayList<String>(Arrays.asList(arrayOfStrings2));
        List<String> list3 = Arrays.asList(arrayOfStrings2);

        // 3
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("one");
        al1.add("two");

        ArrayList<String> al2 = new ArrayList<String>(al1);

    // 5- С помощью clone() // Тоже самое, что и 2 пункт(Arrays.asList), но изменения в одном объекте НЕ отражаются в другом
        String[] arrayOfStrings5 = {"3", "2", "3", "4", "6"};
        String[] listOfStrings5 = arrayOfStrings5.clone();

        ArrayList<String> al3 = new ArrayList<String>();
        ArrayList<String> al4 = (ArrayList<String>) al3.clone();

        String[] array = {"3", "2", "3", "4", "6"};
        List list1 = Arrays.asList(array.clone());


    // 6 - Скопировать массив
        String[] arr = {"3", "2", "6", "4", "6"};
        String[] arr1 = Arrays.copyOf(arr, arr.length);

    // 7 stream + collect
        List<Integer> listStream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = listStream.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(collect);

    // 8 - Перезаписать значения в цикле

    }
}
