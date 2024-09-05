package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main1 {
    public static void main(String[] args) throws IOException {
        try {
            Writer writer = new FileWriter("hello.txt", true); //true дописывание в конец а не перезапись


            writer.write("Hello world");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
