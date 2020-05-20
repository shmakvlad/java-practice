package Nasledovanie;


public class Nasledovanie {

    public static void main(String[] args) {

        Cat meinkun = new Cat();
        Dog laika = new Dog();
        System.out.println();

        laika.name = "Zorka";
        laika.lay();
        laika.sit();
        meinkun.sleep();
        meinkun.sayHello("Vaska");
        laika.height = 200;
        laika.Walk("Dom kulturi");
        System.out.println("Name: " + laika.name + " " + "Height: " + laika.height);

        meinkun.weight = 12;
        meinkun.color = "white";
        meinkun.name = "Vaska";
        System.out.println("Name: " + meinkun.name + " " + "Weight: " + meinkun.weight + " " + "Color: " + meinkun.color);

        meinkun.poroda = 15;
        System.out.println(meinkun.poroda);

        Cat pers = new Cat();
        System.out.println(pers.weight);
        pers.weight = 44;
        System.out.println(meinkun.weight);

        pers.publ = 1;
//        pers.priv = 0;
        pers.protect = 1;
        pers.var = 1;

        // Incapsulation

        laika.sleep();
        laika.sleepProtected();
        laika.sleeping();
//        laika.sleepPrivate();
        System.out.println();

        Dog terier = new Dog();
        System.out.println(terier.getWeight());
        terier.setWeight(10);
        System.out.println(terier.getWeight());
        System.out.println();
        laika.setWeight(20);

        System.out.println(laika.getWeight());
        System.out.println(terier.getWeight());
        System.out.println();

        laika.setWeight(44);
        System.out.println(laika.getWeight());
        System.out.println(terier.getWeight());


    }
}
