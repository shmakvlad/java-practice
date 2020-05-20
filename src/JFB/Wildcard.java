package JFB;

import Nasledovanie.Animal;
import Nasledovanie.Cat;
import Nasledovanie.Dog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Wildcard {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList();
        animals.add(new Animal("Animal"));
        animals.add(new Animal());
        animals.add(new Cat("Cat"));
        animals.add(new Cat());
        animals.add(new Dog("Dog"));
        animals.add(new Dog());

        List<Cat> cats = new ArrayList();
        cats.add(new Cat());
        cats.add(new Cat("Vasya"));

        print(animals);
        System.out.println();
        System.out.println();
        print(cats);

        System.out.println();
        System.out.println();
        List list = new ArrayList();
        list.add(new Date());
        list.add(new Animal());
        list.add(123);
        list.add("ola");
        print2(list);


        System.out.println();
        System.out.println();
        List<Object> lists = new ArrayList();
        lists.add(123);
        lists.add(new Cat());
        lists.add(new ArrayList<>());
        lists.add("String");
        lists.add(new Integer(55));
        print2(lists);

    }

    private static void print(List<? extends Animal> animal){
        for (Animal ls : animal){
            System.out.println(ls);
            ls.sleep();
            ls.saySmth();
//            ls.sayHello("ola" + (int) (Math.random() * 5));
            System.out.println();
        }
    }

    private static void print2(List<? super Animal> animal){
        for (Object ls : animal){
            System.out.println(ls);
        }
    }
}
