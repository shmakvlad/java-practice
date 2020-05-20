package Classes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Classes {

    public static void main(String[] args) {

    Car audi = new Car();
    audi.weight = 2000;
    audi.color = "Black";
    audi.height = 200;
    audi.length = 500;

    System.out.println();
    audi.plusWeight(150);
    audi.drive(210);

    System.out.println();
    audi.plusWeight(750);
    audi.drive(210);

    System.out.println();
    audi.minusWeight(250);
    audi.drive(110);

    Car mercedes = new Car();
    Car bmw = new Car();
    mercedes.color = "White";
    bmw.color = "Red";

    System.out.println();
    mercedes.sayColor("Mersedes");



    Phone iPhone = new Phone();
    System.out.println(iPhone.price);
    iPhone.price = 400;
    System.out.println(iPhone.price);
    System.out.println();

    Phone samsung = new Phone("A80", 500, 1920, 16, "Android");
    System.out.println("Model: " + samsung.model + " Price: " + samsung.price + " Resolution: " + samsung.resolution + " Cam: " + samsung.cam + " Operation system: " + samsung.system);
    System.out.println(samsung.price);
    System.out.println();

    System.out.println(iPhone.memory);
    samsung.sayModel();
    iPhone.sayHello();
//    samsung.memory = 8;
    System.out.println(iPhone.memory);
    System.out.println();

    System.out.println(iPhone.connection);
    Phone.connection = "4G + 5G";
    System.out.println(samsung.connection);

    }
}
