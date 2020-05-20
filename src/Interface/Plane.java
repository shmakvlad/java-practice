package Interface;

public class Plane implements Transport, ArcTech{

    public int speed;

    @Override
    public void go() {
        System.out.println("We are flying !");
    }

    @Override
    public void stop() {
        System.out.println("we landed successfully !");
    }

    public void speed(int speed){
        this.speed = speed;
    }

    @Override
    public void ArcTechGet() {
        System.out.println("Hello !");
    }

    @Override
    public int getWeight( int a ) {
        return a * 10;
    }

    public static int getMass(int a) {
        int b = a + 20;
        return b;
    }
}
