package Incapsulation;

import Nasledovanie.Animal;
import Nasledovanie.Dog;

public class Inakapsulation extends Animal{

    void method(){

        Dog dog = new Dog();
        dog.publ = 1;
//        dog.priv = 0;
//        dog.protect = 0;
//        dog.protect = 0;
        protect = 1;
//        dog.var = 0;
        dog.setWeight(21);
        System.out.println(dog.getWeight());
        dog.sleep();
        dog.Walk("Skoriny 12");

        Animal cat = new Animal();
        cat.sleep();
//        cat.sleepPrivate();
//        cat.sleepProtected();
//        cat.sleeping();

//        cat.protect = 0;
//        Animal.protect = 0;
        cat.change = 1;
        Animal.change = 2;
        change = 3;

    }
}

