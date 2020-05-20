package JFB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadDataFromFile {
    public static void main(String[] args)  {
        String separator = File.separator;
        String path = separator + "Users" + separator + "shmakvlad" + separator + "Documents" + separator + "Work" + separator + "Data files" + separator + "file";
        File file = new File(path);

        try (Scanner sc = new Scanner(file)){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (Scanner sc = new Scanner(file)){
            String line = sc.nextLine();
            String[] wor = line.split(" ");
            System.out.println(Arrays.toString(wor));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
