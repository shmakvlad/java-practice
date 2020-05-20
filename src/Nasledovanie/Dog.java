package Nasledovanie;


public class Dog extends Animal {

    int height;
    private int weight;

    public Dog(){
        super("String");
    }

    public Dog(String name){
        this();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sit() {
        System.out.println("I am sitting !");
        publ = 1;
        protect = 1;
        var = 1;
//        priv = 0;
    }

    public void lay() {
        System.out.println("I am laying !");
        sleep();
        sleepProtected();
        sleeping();
//        sleepPrivate();
    }

    @Override
    public void sleep(){
        System.out.println("Dog Zzzzz");
    }

}
