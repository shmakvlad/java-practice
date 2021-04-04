package Java.AbstractClasses;

public abstract class Animal {

    public abstract void sayHello();
    abstract void sayGoodbye();

    public void walk(String place){
        System.out.println("I am walking here " + place);
    }

}
