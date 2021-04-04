package Console.BufferedReaderWriter;

import java.io.*;

public class FileReaderWriterExample {

    public static void main(String[] args) {

        File readFromFile = new File("src/BufferedReaderWriter/ReadFromThisFile.txt");
        File writeToFile = new File("src/BufferedReaderWriter/WriteToThisFile.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(readFromFile))) {
            try(BufferedWriter writter = new BufferedWriter(new FileWriter(writeToFile))) {
                while (reader.ready()) {
                    writter.write(reader.readLine());
                    writter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
