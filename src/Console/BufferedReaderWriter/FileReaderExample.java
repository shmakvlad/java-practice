package Console.BufferedReaderWriter;

import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) {
        File file = new File("src/BufferedReaderWriter/ReadFromThisFile.txt");

        // 1
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 2
        try(BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(file))));) {
            while (fileReader.ready()) {
                System.out.println(fileReader.readLine());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}
