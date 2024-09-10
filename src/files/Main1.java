package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter("hello.txt", true); //true дописывание в конец а не перезапись


            writer.write("Hello world");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e1) {
                    System.out.println("Bad");
                }
            }
        }
    }
}