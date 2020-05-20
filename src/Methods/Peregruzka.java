package Methods;

public class Peregruzka {

    public static void main(String[] args) {

        System.out.println(gettingSum(10,20));
        System.out.println(gettingSum(10,20, 30));
        sayHello("Dima");
        sayHello("Misha","Romanov");
        sayHello();
        int[] list = { 1, 3, 4, 23, 44, 62, 31 };
        System.out.println("Сумма чисел = " + gettingSum(list));
    }

    static int gettingSum(int x, int y){
        return x + y;
    }

    static int gettingSum(int x, int y, int z){
        return x + y + z;
    }

    static int gettingSum(int[] list){
        int sum = 0;
        for (int i = 0; i < list.length; i++ ){
            sum = sum + list[i];
        }
        return sum;
    }

    static void sayHello(String name){
        System.out.println("Hello, " + name + ", you are my friend");
    }

    static void sayHello(String name, String surname){
        System.out.println("Hello, " + name + " " +  surname + ", you are my friend");
    }

    static void sayHello(){
        System.out.println("Hello, i'm your fan");
    }

}

