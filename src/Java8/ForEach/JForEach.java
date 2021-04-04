package Java8.ForEach;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class JForEach {

    public static void main(String[] args) {
        loopStreamJava8();
        loopListJava8();
        loopMapJava8();
    }

    public static void loopStreamJava8() {
        Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
        s.forEach(x -> System.out.println(x));
        s.parallel().forEach(x -> System.out.println(x));
        s.parallel().forEachOrdered(x -> System.out.println(x));
    }

    public static void loopListJava8() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(null);
        list.add("D");

        // lambda
         list.forEach(x -> System.out.println(x));
         list.forEach(new Consumer<String>() {
             @Override
             public void accept(String s) {
                 if (s != null){
                     System.out.println(s.length());
                 }
             }
         });

        // method reference
        list.forEach(System.out::println);

        // filter null value
        list.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        Arrays.asList("a","b","c").forEach(x -> System.out.println(x));
    }

    public static void loopMapJava8() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put(null, 20);
        map.put("C", 30);
        map.put("D", null);
        map.put("E", 50);
        map.put("F", 60);

        // classic
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }

        // lambda
        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        // with logic
        map.forEach(
                (k, v) -> {
                    if (k != null) {
                        if (v != null) {
                            System.out.println("Key : " + k + ", Value : " + v);
                        }
                    }
                }
        );
    }
}
