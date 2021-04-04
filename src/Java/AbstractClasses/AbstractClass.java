package Java.AbstractClasses;

public class AbstractClass {

    public static void main(String[] args) {

    Animal animal = new Animal() {
        @Override
        public void sayHello() {
            System.out.println("This is Animal !");
        }

        @Override
        void sayGoodbye() {
            System.out.println("Bye Animal.");
        }
    };
    System.out.println();

    animal.sayGoodbye();
    animal.sayHello();
    animal.walk("Dom kultyri");
    System.out.println();

    Bird bird = new Bird();
    bird.sayGoodbye();
    bird.sayHello();
    bird.walk("Pushkinskaya");
    System.out.println();

    Colibri col = new Colibri();
    col.walk("Pobeda square");
    col.sayHello();
    col.sayGoodbye();

    }
}
