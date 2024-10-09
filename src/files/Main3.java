package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File[] files = new File[0];
        File file = new File(path);
        if (file.isFile()) {
            System.out.println("Error");
        } else if (file.isDirectory()) {
            files = file.listFiles();
            System.out.println(Arrays.toString(files));


        }
    }
}
