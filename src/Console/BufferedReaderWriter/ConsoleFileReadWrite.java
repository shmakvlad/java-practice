package Console.BufferedReaderWriter;

import java.io.*;

public class ConsoleFileReadWrite {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("file.txt");

        InputStream inStream = new FileInputStream("c:/source.txt");
        OutputStream outStream = new FileOutputStream("c:/result.txt");

        // 1
        BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(reader.readLine()))));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())));

        BufferedReader fileReaderFile = new BufferedReader((new InputStreamReader(new FileInputStream(file))));
        BufferedWriter bufferedWriterFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

        // 2
        BufferedReader read = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter writter = new BufferedWriter(new FileWriter(reader.readLine()));

        BufferedReader readFile = new BufferedReader(new FileReader(file));
        BufferedWriter writterFile = new BufferedWriter(new FileWriter(file));
    }

}
