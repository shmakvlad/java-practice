package Nasledovanie;

public class Cat extends Animal {

    static int weight;

    public Cat(){
    }

    public Cat(String name){
        super(name);
    }

    public static void sayHello(String name){
        System.out.println("Hello my name is " + name);
    }

    @Override
    public void saySmth(){
        System.out.println("Mew mew mew , mur mur mur !");
    }

}
