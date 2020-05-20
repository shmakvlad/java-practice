package Interface;

public class Car implements Transport {

    private String model;
    private int speed;

    public Car() {

    }

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void go() {
        System.out.println("We are driving !");
    }

    @Override
    public void stop() {
        System.out.println("We stand still.");
    }
}
