package Java8.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {

    public static void main(String[] args) {
        // 1 forEach
        List<String> list = Arrays.asList("node", "java", "python", "ruby", "go");
        list.forEach(System.out::println);

        // 2 anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                SimplePrinter.print(s);
            }
        });

        // 3 lambda expression
        list.forEach(x -> SimplePrinter.print(x));

        // 4 method reference
        list.forEach(SimplePrinter::print);
    }

}

class SimplePrinter {
    public static void print(String str) {
        System.out.println(str);
    }

}
