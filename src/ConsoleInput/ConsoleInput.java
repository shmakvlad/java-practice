package ConsoleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleInput {


    public static void main(String[] args) {
        BufferedReader inputName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inputBYear = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Введите имя:");
            String name = inputName.readLine();
            System.out.print("Введите год рождения:");
            int year = Integer.parseInt(inputBYear.readLine());
            System.out.println(name + " " + year);

        } catch (IOException ex) {
            System.out.println("Reading error");
        }
    }
}