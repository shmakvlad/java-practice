package HelloWorld;

import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("\nHello World! ");
        System.out.println("It is my first program in Udemy!");
        System.out.println("See you later!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Введите имя ");
        String stroka = sc.nextLine();

        System.out.print("Вам " + age + "лет. ");
        System.out.println("Вас зовут " + stroka);
        System.out.println();

//        String name = "vlad";
//        String surname = "shmakov";
//        System.out.println(name);
//        System.out.println(surname);
//        System.out.println();
//
//        surname = name;
//        System.out.println(name);
//        System.out.println(surname);

    }

}
