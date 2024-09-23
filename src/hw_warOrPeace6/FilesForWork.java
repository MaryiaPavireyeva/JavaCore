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
        System.out.println("Пожалуйста, выберите файл для работы:  ");
        String fileWork = scanner.nextLine();
        String stop = "Стоп";
        List<String> filePath = new ArrayList<>();
        Map<String, Integer> stringsAndCount = new HashMap<>();
        while (true) {

            filePath.add(fileWork);

            System.out.println(" ");
            System.out.println("Введите слово или строку для поиска:  ");
            String searchedString = scanner.nextLine();
            int quantity = 0;

            if (stringsAndCount.isEmpty()) {
                quantity++;
                stringsAndCount.put(searchedString, quantity);
            } else {
                Map<String, Integer> stringsAndCount2 = Map.copyOf(stringsAndCount);
                for (Map.Entry<String, Integer> valuess : stringsAndCount2.entrySet()) {
                    String key = valuess.getKey();
                    Integer value = valuess.getValue();
                    if (Objects.equals(key, searchedString)) {
                        if (value >= 0) {
                            value++;
                            System.out.println(value);
                            stringsAndCount.replace(searchedString, stringsAndCount.getOrDefault(searchedString, 0) + 1);
                        }
                    } else
                        stringsAndCount.put(searchedString, 1);
                }

            }

            System.out.println(stringsAndCount);


            String content = Files.readString(Path.of(path + "/" + fileWork));
            FilesForWork filesForWork = new FilesForWork(content);
            System.out.println("Вот, что мы нашли: " + filesForWork.search(content, searchedString));
            System.out.println("Если хочешь продолжить поиск, введи слово Продолжить. Если хочешь выйти в папку, введи слово Стоп");
            String wordForWork = scanner.nextLine();
            if (Objects.equals(wordForWork, stop)) {
                txtFilesList(path);
                System.out.println("Пожалуйста, выберите файл для работы:  ");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Введите путь к папке: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        //обработать если путь неправильный

//        if(path)  дописать  про условие если директория заполнена + дописать проверки если это не директория
//        for (int i = 0; i < 200; i++) {
//            String fileName = UUID.randomUUID().toString();
//            File file = new File(path + "/" + fileName + ".txt");
//            file.createNewFile();
//            Writer write = new FileWriter(file);
//            write.write("В этом примере сначала создается объект BufferedReader, который оборачивает объект FileReader. FileReader открывает файл для чтения, а BufferedReader обеспечивает эффективное чтение больших объемов текста из файла. Затем происходит чтение файла построчно и добавление каждой строки в объект StringBuilder, который представляет собой изменяемую последовательность символов и может быть использован для создания и модификации строк.");
//            write.flush();
//            write.close();
//        }

        System.out.println(" ");
        txtFilesList(path);

        Writer write = new FileWriter("result.txt");

        System.out.println(" ");
        workWithFile(scanner, path);
    }
}

