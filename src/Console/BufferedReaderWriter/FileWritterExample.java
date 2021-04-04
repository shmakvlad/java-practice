package Console.BufferedReaderWriter;

import java.io.*;

public class FileWritterExample {

    public static void main(String[] args) throws IOException {
        File file = new File("src/BufferedReaderWriter/WriteToThisFile.txt");
        String[] array = { "one", "two", "three", "four", "five" };

        // 1
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(file))) {
            for (String value : array) {
                writter.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2
        try (BufferedWriter in = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
            for (String value : array) {
                in.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
