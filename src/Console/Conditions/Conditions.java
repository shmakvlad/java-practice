package Console.Conditions;


import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
    int i = in.nextInt();
        if (i == 10) {
            System.out.println("i = десяти, i = " + i);
        }
        else if (i > 5 && i < 10) {
            System.out.println("i больше пяти и меньше десяти, i = " + i);
        }
        else if (i > 10 && i < 20) {
            System.out.println("i > десяти и < двадцати, i = " + i);
        }
        else {
            System.out.println("i = " + i);
        }

    in.nextLine();
        System.out.println("Введите число: ");
    String j = in.nextLine();
    int opersw = Integer.parseInt(j);

    switch (opersw){
        case 1:
            System.out.println("Вы ввели число: " + opersw);
            break;
        case 2:
            System.out.println("Вы ввели число: " + opersw);
            break;
        case 3:
            System.out.println("Вы ввели число: " + opersw);
            break;
        default:
            System.out.println("Введённое вами число не входит в диапазон допустимых чисел.");
    }

    }
}
