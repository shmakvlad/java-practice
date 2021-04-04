package Java8.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ListToList {
    public static void main(String[] args) {

        ListToList obj = new ListToList();

        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        // lambda
        List<String> result1 = obj.map(list, x -> obj.sha256(x));
        List<String> result2 = obj.map(list, x -> x.toUpperCase());
        List<String> result3 = obj.map(list, x -> x.substring(1,3));

        // method reference
        List<String> result4 = obj.map(list, obj::sha256);

        result1.forEach(System.out::println);
        System.out.println();

        result2.forEach(System.out::println);
        System.out.println();

        result3.forEach(System.out::println);
        System.out.println();

        result4.forEach(System.out::println);
        System.out.println();
    }

    public <T, R> List<R> map(List<T> list, Function<T, R> func) {
        List<R> result = new ArrayList<>();
            for (T t : list) {
                result.add(func.apply(t));
            }
        return result;
    }

    public String sha256(String str) {
        return str.toUpperCase();
    }
}
