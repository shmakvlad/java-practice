package Java8.Function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ListToMap {
    public static void main(String[] args) {

        ListToMap obj = new ListToMap();

        List<String> listString = Arrays.asList("node", "c++", "java", "javascript");
        List<Integer> listInteger = Arrays.asList(0,1,2,3,5,6,10,12,100,101);

        // lambda
        Map<String, Integer> mapString = obj.convertListToMap(listString, x -> x.length());
        Map<Integer, Integer> mapInteger = obj.convertListToMap(listInteger, x -> x * 2);

        System.out.println(mapString);    // {node=4, c++=3, java=4, javascript=10}
        System.out.println(mapInteger);    // {0=0, 1=2, 2=4, 3=6, 100=200, 5=10, 101=202, 6=12, 10=20, 12=24}

        // method reference
        Map<String, Integer> map2String = obj.convertListToMap(listString, obj::getLength);
        System.out.println(map2String);
    }

    public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
            for (T t : list) {
                result.put(t, func.apply(t));
            }
        return result;
    }

    public Integer getLength(String str) {
        return str.length();
    }
}
