package Nasledovanie;

public class Polimorfizm {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();

        System.out.println();
        dog.saySmth();
        cat.saySmth();
        animal.saySmth();

    }

}
