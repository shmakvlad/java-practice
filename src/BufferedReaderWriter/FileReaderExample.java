package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        File file = new File("src/BufferedReaderWriter/ReadFromThisFile.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            // 1
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 2
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}
