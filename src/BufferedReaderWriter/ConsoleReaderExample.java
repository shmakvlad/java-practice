package BufferedReaderWriter;

import java.io.*;

public class ConsoleReaderExample {

    public static void main(String[] args) {
        File writeToFile = new File("src/BufferedReaderWriter/WriteToThisFile.txt");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(writeToFile))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) {
                    writter.write(line);
                    writter.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
