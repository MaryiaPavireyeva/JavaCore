package hw_warOrPeace6;

import javax.xml.transform.Source;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilesForWork {
    String content;

    public FilesForWork(String content) {
        this.content = content;
    }

    public String search(String text, String word) {
        String founded = "Мы ничего не нашли";
        Pattern p = Pattern.compile(word);
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            founded = text.substring(matcher.start(), matcher.end());
            }
        return founded;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Введите путь к папке: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

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
        System.out.println("Список всех txt файлов, которые мы нашли в указанной папке: ");
        File folders = new File(path);
        File[] files = folders.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String filesName = file.getName();
                if (!file.isFile()) {
                    System.out.println("Не нашли файлов"); //не работает
                }
                if (filesName.endsWith("txt")) {
                    System.out.println(file.getName());
                    if(!filesName.endsWith("txt")) {
                        System.out.println("Не нашли txt файла"); //не работает
                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println("Пожалуйста, выберите файл для работы:  ");
        Scanner scanner2 = new Scanner(System.in);
        String fileWork = scanner.nextLine();
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                System.out.println(" ");
                System.out.println("Введите слово или строку для поиска:  ");
                Scanner scanner3 = new Scanner(System.in);
                String fileWork2 = scanner.nextLine();
                String stop = "Стоп";
                String content = Files.readString(Path.of(path + "/" + fileWork));
                FilesForWork filesForWork = new FilesForWork(content);
                System.out.println("Вот, что мы нашли: " + filesForWork.search(content, fileWork2));
                System.out.println("Если хочешь продолжить поиск, введи слово Продолжить. Если хочешь выйти, введи слово Стоп");
                Scanner scanner4 = new Scanner(System.in);
                String wordForWork = scanner.nextLine();
                if(Objects.equals(wordForWork, stop)) {
                    break;
                }
            }
            System.out.println("Поиск окончен. Для возврата в папку");
        } catch (IOException e) {
            throw new RuntimeException(e);
//        BufferedReader buffer = new BufferedReader(new FileReader(path + "/" + fileWork));
//        String s = buffer.readLine();
//        while (s != null) {
//            System.out.println(s);
//            s = buffer.readLine();
        }


    }
}
