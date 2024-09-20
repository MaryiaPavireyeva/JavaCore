package hw_warOrPeace6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilesForWork {
    String content;

    public FilesForWork(String content) {
        this.content = content;
    }

    /**
     * Метод по поиску в файле
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
     * @param path путь к папке
     */
    private static void txtFilesList(String path) {
        System.out.println("Список всех txt файлов, которые есть в папке: ");
        File folders = new File(path);
        File[] files = folders.listFiles();
        if(files.length == 0) {
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
                if(!filesName.endsWith("txt")) {
                    System.out.println("Не нашли txt файла");
                }
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

        System.out.println(" ");
        System.out.println("Пожалуйста, выберите файл для работы:  ");
        String fileWork = scanner.nextLine();
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                System.out.println(" ");
                System.out.println("Введите слово или строку для поиска:  ");
                String fileWork2 = scanner.nextLine();
                String stop = "Стоп";
                String content = Files.readString(Path.of(path + "/" + fileWork));
                FilesForWork filesForWork = new FilesForWork(content);
                System.out.println("Вот, что мы нашли: " + filesForWork.search(content, fileWork2));
                System.out.println("Если хочешь продолжить поиск, введи слово Продолжить. Если хочешь выйти в папку, введи слово Стоп");
                String wordForWork = scanner.nextLine();
                if(Objects.equals(wordForWork, stop)) {
                    txtFilesList(path);
                    System.out.println("Пожалуйста, выберите файл для работы:  ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

