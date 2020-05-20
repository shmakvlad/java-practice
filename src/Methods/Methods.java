package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {

    public static void main(String[] args) {

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    int a = 10;
    int b = 45;
    int sum = getSum(a,b);
    int proizv = getMultiply(a,b);

        System.out.println("Сумма чисел = " + sum + "\n" + "Произведение чисел = " + proizv);
        showSum(2, 5, 9);
        saySmth();
        sayHello("Misha");

    try {
        System.out.print("Введите число a: ");
        int x = Integer.parseInt(read.readLine());

        System.out.print("Введите число b: ");
        int y = Integer.parseInt(read.readLine());

        System.out.print("Введите число с которым хотите сравнить сумму чисел a и b: ");
        int flag = Integer.parseInt(read.readLine());

        boolean result = getTrueOrFalse(x, y, flag);
        if(result){
            System.out.println("a + b > c");
        }else System.out.println("a + b < c");

    } catch(IOException ex) {
        System.out.println("Reading error");
    }

    }

    static int getSum(int x, int y){
        return x + y;
    }

    static int getMultiply(int x, int y){
        int mult = x * y;
        return mult;
    }

    static boolean getTrueOrFalse(int x, int y, int flag){
        if (x + y > flag){
            return true;
        } else return false;
    }

    static void showSum(int x, int y, int z){
        int sum = x + y + z;
        System.out.println("Сумма чисел 2 + 5 + 9 = " + sum);
    }

    static void saySmth(){
        System.out.println("Hello, my name is saySmth()");
    }

    static void sayHello(String name){
        System.out.println("Hello, " + name + ", you are my friend");
    }

}
