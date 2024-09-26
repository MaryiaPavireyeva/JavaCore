package hw_warOrPeace6.Thread;

import java.io.File;
import java.util.Scanner;


public class MainForThread {
    public static void main(String[] args) {

        System.out.println("Введите путь к папке: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        File folders = new File(path);
        File[] files = folders.listFiles();

        ExecutorSearcher ex = new ExecutorSearcher();
        ex.executeSearch(files, "пример");
        System.out.println(ex);

    }
}

