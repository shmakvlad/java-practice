package Java8.Function;

import java.util.function.Function;

public class INTFunction {

    public static void main(String[] args) {
        // Function (Take a string and return the length of the string)
        Function<String, Integer> func = x -> x.length();
        Integer apply = func.apply("hello");
        System.out.println(apply);

        // Function (Take Integer argument and return also an Integer argument multiply by 2)
        Function<Integer, Integer> func2 = x -> x * 2;
        System.out.println(func2.apply(25));

        // Use andThen 1. call function func 2. then call function func2
        Integer result = func.andThen(func2).apply("hello");
        System.out.println(result);

        Integer y = 2;
        Function<Integer, Integer> nf = x -> x * 4;
        System.out.println(nf.apply(y + 5));
    }

}
