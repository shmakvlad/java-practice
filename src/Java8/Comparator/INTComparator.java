package Java8.Comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class INTComparator {

    public static void main(String[] args) {

        List<Car> listCars = getCars();
        listCars.forEach(car -> System.out.println(car));

        // Comparable
        Collections.sort(listCars);
        listCars.forEach(car -> System.out.println(car));

        // Comparator class
        Comparator yearComparator = new YearComparator();
        Collections.sort(listCars, yearComparator);
        listCars.forEach(car -> System.out.println(car));

        // Comparator
        Collections.sort(listCars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });
        listCars.forEach(car -> System.out.println(car));

        // Lambda
        listCars.sort((c1, c2) -> c1.getManufactureYear()-c2.getManufactureYear());
        listCars.forEach(c -> System.out.println(c));

        // Lambda
        listCars.sort((c1, c2) -> c1.getMaxSpeed().compareTo(c2.getMaxSpeed()));
        listCars.forEach(c -> System.out.println(c));

        // Lambda
        listCars.sort((c1, c2) -> c1.getModel().compareTo(c2.getModel()));
        listCars.forEach(c -> System.out.println(c));

        // Lambda comparator reversed
        Comparator<Car> lcc = (c1, c2) -> c1.getModel().compareTo(c2.getModel());
        listCars.sort(lcc.reversed());
        listCars.forEach(car -> System.out.println(car));
    }

    private static List<Car> getCars() {
        List<Car> result = new ArrayList<Car>();

        result.add(new Car(1996, "Ferrari", new BigDecimal(335)));
        result.add(new Car(1999, "Audi", new BigDecimal(220)));
        result.add(new Car(2020, "Mercedes-Benz", new BigDecimal(410)));
        result.add(new Car(2011, "Honda", new BigDecimal(155)));

        return result;
    }
}
