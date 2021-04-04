package Java8.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class INTPredicate {
    public static void main(String[] args) {
        predicate1();
        predicate2();
        predicate3();
        predicate4();
        predicate5();

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        System.out.println(StringProcessor.filter(
                list, x -> x.startsWith("A")));                    // [A, AA, AAA]

        System.out.println(StringProcessor.filter(
                list, x -> x.startsWith("A") && x.length() == 3)); // [AAA]

        List<Integer> list2 = Arrays.asList(1, 2, 33, 4, 52, 6, 7, 5, 19, 3);
        list2.stream()
                .filter(x -> x > 5)
                .collect(Collectors.toList())
                .forEach(x -> System.out.println(x * 2));
    }

    public static void predicate1(){
        Predicate<Integer> greaterThan5 = x -> x > 5;
        boolean result = greaterThan5.test(11);
        System.out.println(result);

        List<Integer> list = Arrays.asList(1, 2, 33, 4, 52, 6, 7, 5, 19, 3);
        List<Integer> collect = list.stream()
                .filter(greaterThan5)
                .collect(Collectors.toList());

        System.out.println(collect);

        List map = new ArrayList();
        for (Integer i : list){
            if (greaterThan5.test(i)){
                map.add(i);
            }
        }
        System.out.println(map);
    }

    public static void predicate2(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream()
                .filter(x -> x > 5 && x < 8).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void predicate3(){
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        List<String> collect = list.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    public static void predicate4(){
        Predicate<String> startWithA = x -> x.startsWith("A");
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect = list.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    public static void predicate5(){
        Predicate<String> startWithA = x -> x.startsWith("a");

        // start with "a" or "m"
        boolean result = startWithA.or(x -> x.startsWith("m")).test("mkyong");
        System.out.println(result);

        // !(start with "a" and length is 3)
        boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result2);
    }
}

class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
