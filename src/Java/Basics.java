package Java;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        // String
        String str = new String("Ola, privet mir");
        String poz = "Ola";
        System.out.println(str);
        System.out.println(poz);
        System.out.println();

        // Scaner, while, do while, break, switch
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число: ");
            number = sc.nextInt();
        } while (number < 10);

        switch (number){
            case 1:
                System.out.println("1");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Ни одно из условий не подошло");
        }

        sc.nextLine();

        String stroka;
        while (true) {
            System.out.print("Введите строку: ");
            stroka = sc.nextLine();
            if (stroka.length() > 10){
                break;
            }
        }
        System.out.println("Введенные вами данные: " + number + " " + stroka);

        // Continue
        for (int i = 0; i <= 15; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
