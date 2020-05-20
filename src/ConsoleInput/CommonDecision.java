package ConsoleInput;

import java.io.*;

public class CommonDecision {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Hello. Please write your name: ");
            String name = br.readLine();
            System.out.print("Hello. Please write your age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Your name is: " + name + "\n" + "Your age is: " + age);
        } catch (IOException ex) {
            System.out.println("Reading error");
        }
    }
}
