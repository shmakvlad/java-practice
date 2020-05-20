package JFB;

import java.io.*;
import java.text.ParseException;

public class Exeptions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = null;
            System.out.println(s.length());
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Ola");
        }

        try {
            run();
        } catch (IOException | ArrayIndexOutOfBoundsException | ParseException e){
            System.out.println(e);
        }

        while (true){
            System.out.print("Введите число: ");
            int x = Integer.parseInt(reader.readLine());
            if (x == 0){
                throw new MyExeption("Вы ввели ноль.");
            }
        }

    }

    public static void run() throws IOException, ArrayIndexOutOfBoundsException, ParseException{
        System.out.println("I am running!");
    }
}

class MyExeption extends IOException{
    public MyExeption(String description) throws IOException, RuntimeException, FileNotFoundException {
        super(description);
    }
}

