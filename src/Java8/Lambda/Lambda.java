package Java8.Lambda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "java", "python", "ruby");
        list.forEach(str -> System.out.println(str));
        list.forEach(str -> System.out.println(str.length()));
    }

}
