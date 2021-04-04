package Java8.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class INTBiFunction {

    public static void main(String[] args) {
        Java8BiFunction1();
        Java8BiFunction2();
        Java8BiFunction3();
        Java8BiFunction4();
        Java8BiFunction5();
        Java8BiFunction6();
    }

    public static void Java8BiFunction6() {
        GPS obj = factory("40.741895", "-73.989308", GPS::new);
        System.out.println(obj);
    }

    public static <R extends GPS> R factory(String Latitude, String Longitude, BiFunction<String, String, R> func) {
        return func.apply(Latitude, Longitude);
    }


    private static <R> R playTwoArgument(Integer i1, Integer i2, BiFunction<Integer, Integer, R> func) {
        return func.apply(i1, i2);
    }

    public static <R> R powToString(Integer a1, Integer a2, BiFunction<Integer, Integer, Double> func, Function<Double, R> func2) {
        return func.andThen(func2).apply(a1, a2);
    }

    public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2, BiFunction<A1, A2, R1> func, Function<R1, R2> func2) {
        return func.andThen(func2).apply(a1, a2);
    }

    public static void Java8BiFunction1() {
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
        System.out.println(result3);

        BiFunction<Integer, Integer, Integer> function = (x, y) -> x * y;
        Integer ch = function.apply(5,4);
        System.out.println(ch);
    }

    public static void Java8BiFunction2() {
        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = func2.apply(2, 4);
        System.out.println(result2);

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1, x2);
        List<Integer> result3 = func3.apply(2, 3);
        System.out.println(result3);
    }

    public static void Java8BiFunction3() {
        // Math.pow(a1, a2) returns Double
        BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> Math.pow(a1, a2);

        // takes Double, returns String
        Function<Double, String> func2 = input -> "Result : " + String.valueOf(input);
        String result = func1.andThen(func2).apply(2, 4);
        System.out.println(result);
    }

    public static void Java8BiFunction4() {
        String result = powToString(5, 3,
                (a1, a2) -> Math.pow(a1, a2),
                (r) -> "Result : " + String.valueOf(r));
        System.out.println(result);
    }

    public static void Java8BiFunction5() {
        // Take two Integers, pow it into a Double, convert Double into a String.
        String result = convert(2, 4,
                (a1, a2) -> Math.pow(a1, a2),
                (r) -> "Pow : " + String.valueOf(r));
        System.out.println(result);

        Integer result2 = convert(2, 4,
                (a1, a2) -> a1 * a2,
                r -> r * 9);
        System.out.println(result2);

        // Take two Strings, join both, join "cde"
        String result3 = convert("a", "b",
                (a1, a2) -> a1 + a2,
                (r) -> r + "cde");
        System.out.println(result3);

        // Take two Strings, join both, convert it into an Integer
        Integer result4 = convert("100", "200",
                (a1, a2) -> a1 + a2,
                (r) -> Integer.valueOf(r));
        System.out.println(result4);
    }
}

class IntegerUtils {
    public static String join(Integer a, Integer b) {
        return String.valueOf(a + b);
    }
}

class GPS {

    String Latitude;
    String Longitude;

    public GPS(String latitude, String longitude) {
        Latitude = latitude;
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                '}';
    }
}
