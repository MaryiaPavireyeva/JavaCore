package hw_warOrPeace6;

import files.Figure;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilesForWork {
    String content;

    public FilesForWork(String content) {
        this.content = content;
    }

    /**
     * Метод проверяет введенная директория пустая или нет и если пустая, то создает 200 файлов в ней
     *
     * @param path путь к папке
     * @throws IOException
     */
    private static void directoryWithFiles(String path) throws IOException {
        File directory = new File(path);
        if (directory.isDirectory()) {
            String[] files = directory.list();
            if (files.length == 0) {
                for (int i = 0; i < 200; i++) {
                    String fileName = UUID.randomUUID().toString();
                    File file = new File(path + "/" + fileName + ".txt");
                    file.createNewFile();
                    Writer write = new FileWriter(file);
                    write.write("В этом примере сначала создается объект BufferedReader, который оборачивает объект FileReader. FileReader открывает файл для чтения, а BufferedReader обеспечивает эффективное чтение больших объемов текста из файла. Затем происходит чтение файла построчно и добавление каждой строки в объект StringBuilder, который представляет собой изменяемую последовательность символов и может быть использован для создания и модификации строк.");
                    write.flush();
                    write.close();
                }
            }
        } else {
            System.out.println("Неправильный путь к папке. Введите новый путь");
            Scanner scanner = new Scanner(System.in);
            path = scanner.nextLine();
            directoryWithFiles(path);
        }
    }

    /**
     * Метод по поиску слов в файле Задание Работа с файлами
     *
     * @param text файл, в котором ищем
     * @param word слово или фраза, которую ищем
     * @return найденный результат
     */
    public String search(String text, String word) {
        String result = "Мы ничего не нашли";
        Pattern p = Pattern.compile(word);
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            result = text.substring(matcher.start(), matcher.end());
        }
        return result;
    }

    /**
     * Метод печатает список txt файлов в папке
     *
     * @param path путь к папке
     */
    private static void txtFilesList(String path) {
        System.out.println("Список всех txt файлов, которые есть в папке: ");
        File folders = new File(path);
        File[] files = folders.listFiles();
        if (files.length == 0) {
            System.out.println("Не нашли файлы. Введите другой путь: ");
            Scanner scanner = new Scanner(System.in);
            String path2 = scanner.nextLine();
            txtFilesList(path2);
        }
        for (File file : files) {
            if (file.isFile()) {
                String filesName = file.getName();
                if (filesName.endsWith("txt")) {
                    System.out.println(file.getName());
                }
                if (!filesName.endsWith("txt")) {
                    System.out.println("Не нашли txt файла");
                }
            }
        }
    }


    /**
     * Метод работает с файлом, ищет слово и позволяет вернутся в директорию и выбрать другой файл для поиска
     *
     * @param path путь к папке
     */
    private static void workWithFile(Scanner scanner, String path) throws IOException {
        Map<String, Integer> stringsAndCount = new HashMap<>();
        Map<String, Map<String, Integer>> stringsWordsCount = new HashMap<>();
        Writer write = new FileWriter("result.txt");
        System.out.println("Пожалуйста, выберите файл для работы:  ");
        String fileWork = scanner.nextLine();
        while (true) {
            String stop = "Стоп";

            System.out.println(" ");
            System.out.println("Введите слово или строку для поиска:  ");
            String searchedString = scanner.nextLine();
            int quantity = 0;
            // считаем сколько раз искали слово и кладем ключ(слово) - значение(раз) в мапу
            if (stringsAndCount.isEmpty()) {
                quantity++;
                stringsAndCount.put(searchedString, quantity);
            } else {
                if (stringsAndCount.containsKey(searchedString)) {
                    stringsAndCount.put(searchedString, stringsAndCount.get(searchedString) + 1);
                } else {
                    stringsAndCount.put(searchedString, 1);
                }
            }
            //кладем в новую мапу имя файла и мапу с ключ-значение
            stringsWordsCount.put(fileWork, stringsAndCount);
            System.out.println(stringsWordsCount);

            String content = Files.readString(Path.of(path + "/" + fileWork));
            FilesForWork filesForWork = new FilesForWork(content);
            System.out.println("Вот, что мы нашли: " + filesForWork.search(content, searchedString));
            System.out.println("Если хочешь продолжить поиск, введи слово Продолжить. Если хочешь выйти в папку, введи слово Стоп");
            String wordForWork = scanner.nextLine();

            if (Objects.equals(wordForWork, stop)) {
                //записываем мапу в файл
                write.write(stringsWordsCount.toString() + "\n");
                write.flush();
                stringsAndCount.clear();
                stringsWordsCount.clear();
                txtFilesList(path);
                System.out.println("Пожалуйста, выберите файл для работы:  ");
                fileWork = scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Введите путь к папке: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        directoryWithFiles(path);

        System.out.println(" ");
        txtFilesList(path);

        System.out.println(" ");
        workWithFile(scanner, path);
    }

}

