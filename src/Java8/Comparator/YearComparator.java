package Java8.Comparator;

import java.util.Comparator;

public class YearComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getManufactureYear() - o2.getManufactureYear();
    }
}
