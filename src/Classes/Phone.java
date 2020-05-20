package Classes;

public class Phone {

    public Phone(){

    }

    public Phone(String model, int price, int resolution, int cam, String system){

        this.model = model;
        this.price = price;
        this.resolution = resolution;
        this.cam = cam;
        this.system = system;


    }

    final static int memory = 6;
    static String connection = "3G";

    public void sayHello(){
        System.out.println("Hello World !");
    }

    public void sayModel(){
        System.out.println("Model: " + this.model);
    }

    String model;
    int price = 200;
    int resolution;
    int cam;
    String system;

}
