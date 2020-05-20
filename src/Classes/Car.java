package Classes;

public class Car {

    int height;
    int weight;
    int maxWeight = 2700;
    int width = 200;
    int length;
    int speed;
    int maxSpeed = 320;
    String color;


    public void plusWeight(int x){
        this.weight = this.weight + x;
        System.out.println("New weight: " + this.weight);
    }

    public void minusWeight(int x){
        this.weight = this.weight - x;
        System.out.println("New weight: " + this.weight);
    }

    public void drive(int speed){
        if(weight <= maxWeight){
            this.speed = speed;
            System.out.println("We are driving with speed: " + this.speed);
        } else {
            System.out.println("Weight is more than available!");
            System.out.println("Max weight is: " + maxWeight);
        }
    }

    public void sayColor(String carName){
        System.out.println("The color of the car " + carName + " is " + this.color);
    }

}
