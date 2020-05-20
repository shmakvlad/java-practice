package JFB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDataintoFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DataFile");
        PrintWriter pw = new PrintWriter(file);
        String str = "";
        for (int i = 0; i < 150; i++) {
            String in = String.valueOf(i);
            str = str + in + " ";
            pw.println(str);
        }
    }
}
