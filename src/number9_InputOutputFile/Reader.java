package number9_InputOutputFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String c;
        while ((c = reader.readLine()) != null) {
            System.out.println(c);
        }
    }
}
