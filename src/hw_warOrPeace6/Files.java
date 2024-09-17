package hw_warOrPeace6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.UUID;

public class Files {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        for (int i = 0; i < 100; i++) {
            String fileName = UUID.randomUUID().toString();

            File file = new File(path + fileName + ".txt");
            file.createNewFile();
        }
    }
}
