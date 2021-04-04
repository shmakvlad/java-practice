package Java8.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MRToStaticMethod {
    public static void main(String[] args) {
        methodReferenceFirst();
        methodReferenceSecond();
    }

    public static void methodReferenceFirst() {
        List<String> list = Arrays.asList("1", "2", "3");

        // anonymous class
        List<Integer> collect1 = list.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .collect(Collectors.toList());

        // lambda expression
        List<Integer> collect2 = list.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        // method reference
        List<Integer> collect3 = list.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static void methodReferenceSecond() {
        // anonymous class
        String result1 = playTwoArgument(1, 2, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer a, Integer b) {
                return IntegerUtils.join(a, b);
            }
        });

        // lambda
        String result2 = playTwoArgument(2, 2, (a, b) -> IntegerUtils.join(a, b));

        // method reference
        String result3 = playTwoArgument(3, 2, IntegerUtils::join);
    }

    private static <R> R playTwoArgument(Integer i1, Integer i2, BiFunction<Integer, Integer, R> func) {
        return func.apply(i1, i2);
    }
}

class IntegerUtils {
    public static String join(Integer a, Integer b) {
        return String.valueOf(a + b);
    }
}
