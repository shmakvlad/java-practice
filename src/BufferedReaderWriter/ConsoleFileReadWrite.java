package BufferedReaderWriter;

import java.io.*;

public class ConsoleFileReadWrite {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 1
        BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(reader.readLine()))));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())));

        // 2
        BufferedReader read = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter writter = new BufferedWriter(new FileWriter(reader.readLine()));
    }

}
