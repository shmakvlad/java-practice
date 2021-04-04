package Java.AbstractClasses;

public class Bird extends Animal{

    @Override
    public void sayHello() {
        System.out.println("Hello, i am Bird !");
    }

    @Override
    void sayGoodbye() {
        System.out.println("Goodbye, my friend !");
    }
}
