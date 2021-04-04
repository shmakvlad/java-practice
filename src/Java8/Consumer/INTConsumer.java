package Java8.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class INTConsumer {
    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("hello");   // hello

        Consumer<String> length = x -> System.out.println(x.length());
        length.accept("hello");   // 5

        print.andThen(length).accept("hello world");    // hello world // 11
        length.andThen(length).accept("hello world");   // 11 // 11
        System.out.println();


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 10);
        // 1
        list.forEach(x -> System.out.println(x));

        // 2
        list.forEach(System.out::println);

        // 3
        Consumer<Integer> consumer = x -> System.out.println(x);
        forEach(list, consumer);

        // 4
        forEach(list, (Integer x) -> System.out.println(x));

        // 5
        List<String> listString = Arrays.asList("a", "hello", "abc");
        forEach(listString, (String x) -> System.out.println(x.length()));

        // 6
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println(s.compareTo(5));
            }
        });
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
