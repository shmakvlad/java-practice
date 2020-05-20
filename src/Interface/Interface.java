package Interface;

public class Interface {

    public static void main(String[] args) {

    System.out.println();
    Car car = new Car();
    car.go();
    car.stop();
    System.out.println();


    Plane airbus = new Plane();
    airbus.speed(100);
    airbus.go();
    airbus.stop();
    System.out.println(airbus.speed);
    airbus.ArcTechGet();
    System.out.println();

    Plane superjet = new Plane();
    superjet.speed(212);
    System.out.println(superjet.speed);
    System.out.println(airbus.speed);
    System.out.println();

    Car mersedez = new Car(160, "s63amg");
    mersedez.getSpeed();
    mersedez.getModel();
    System.out.println();

    Plane boing = new Plane();
    System.out.println(boing.getWeight(12));
    System.out.println(boing.getMass(12));
    boing.ArcTechGet();

    }
}
