package Java8.Comparator;

import java.math.BigDecimal;

public class Car implements Comparable<Car>{

    private int manufactureYear;
    private String model;
    private BigDecimal maxSpeed;

    public Car(int manufactureYear, String model, BigDecimal maxSpeed) {

        this.manufactureYear = manufactureYear;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(BigDecimal maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactureYear=" + manufactureYear +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }
}
