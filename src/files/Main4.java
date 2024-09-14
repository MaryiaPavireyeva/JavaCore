package files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

public class Main4 {

    public static void main(String[] args) throws IOException {
        List<Figure> figure = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <= 500000; i++) {
            if(random.nextInt(30) % 2 == 0) {
                figure.add(new Triangle(random.nextInt(30),random.nextInt(30),random.nextInt(30)));
            } else
                figure.add(new Rectangle(random.nextInt(30),random.nextInt(30)));
        }

        System.out.println(figure);

        Writer write = new FileWriter("figure.txt");
        write.write(figure.toString());
        write.flush();
        write.close();
    }
}
