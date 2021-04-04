package Java8.Consumer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class INTBiConsumer {
    public static void main(String[] args) {
        Java8BiConsumer1();
        Java8BiConsumer2();
        Java8BiConsumer3();
        Java8BiConsumer4();
    }

    public static void Java8BiConsumer1() {
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);
    }

    public static void Java8BiConsumer2() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Java");
        map.put(2, "C++");
        map.put(3, "Rust");
        map.put(4, "JavaScript");
        map.put(5, "Go");
        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    public static void Java8BiConsumer3() {
        BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer-s.length());
            }
        };
        biConsumer.accept(12,"hello");
    }

    public static void Java8BiConsumer4() {
        addTwo(1, 2, (x, y) -> System.out.println(x + y));          // 3
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y));
    }

    static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);
    }
}
