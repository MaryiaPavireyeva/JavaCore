package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        //трай с ресурсами
        try (
            Writer writer
                    = new FileWriter("hello.txt", true)) {//true дописывание в конец а не перезапись
            writer.write("Hello world");
            writer.flush();
            //флаш прописан в врайтере и можно не писать
            //кто врайтер и файл дал тот его и закрывает
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}