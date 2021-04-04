package Java8.BinaryOperator;


import Java8.Comparator.Car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class INTBinaryOperator {

    public static void main(String[] args) {
        Java8BinaryOperator1();
        Java8BinaryOperator2();
        Java8BinaryOperator3();
    }

    public static void Java8BinaryOperator1() {

        // BinaryOperator
        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
        Integer result2 = func2.apply(23, 34);
        System.out.println(result2);

        // BiFunction
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result = func.apply(2, 3);
        System.out.println(result);
    }

    public static void Java8BinaryOperator2() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
        Integer result = math(Arrays.asList(numbers), 0, (a, b) -> a + b);
        System.out.println(result);
    }

    public static void Java8BinaryOperator3() {
        List<Car> list = Arrays.asList(
                new Car(1936, "Ferrari", new BigDecimal(335)),
                new Car(1987, "BMW", new BigDecimal(645)),
                new Car(2021, "Audi", new BigDecimal(432)),
                new Car(2019, "Mercedes-Benz", new BigDecimal(111))
        );

        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getManufactureYear()-o2.getManufactureYear();
            }
        };

        BinaryOperator<Car> binaryOperator1 = BinaryOperator.maxBy(comparator);
        BinaryOperator<Car> binaryOperator2 = BinaryOperator.minBy(comparator);
        BinaryOperator<Car> binaryOperator3 = BinaryOperator.maxBy(Comparator.comparing(o -> o.getMaxSpeed()));
        BinaryOperator<Car> binaryOperator4 = BinaryOperator.minBy(Comparator.comparing(Car::getMaxSpeed));

        Car result1 = find(list, binaryOperator1);
        Car result2 = find(list, binaryOperator2);
        Car result3 = find(list, binaryOperator3);
        Car result4= find(list, binaryOperator4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    public static Car find(List<Car> list, BinaryOperator<Car> accumulator) {
        Car result = null;
        for (Car t : list) {
            if (result == null) {
                result = t;
            } else {
                result = accumulator.apply(result, t);
            }
        }
        return result;
    }

    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t : list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }
}
