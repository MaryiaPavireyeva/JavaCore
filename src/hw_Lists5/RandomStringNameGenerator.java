package hw_Lists5;

import hw_Lists5.dto.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomStringNameGenerator {

    //он сделал через Supplier


    /**
     * генерация рандомного имени из рандомных символов
     *
     * @return строку из рандомных символов
     */
    public static String randomName() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(Charact.CHARACT.getCharect().charAt(random.nextInt(Charact.CHARACT.getCharect().length())));
        }
        return sb.toString();
    }

    /**
     * генерация рандомного имени из русских символов
     *
     * @return строку из русских символов
     */
    public static String randomNameRus() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(Charact.CHARACTRUS.getCharect().charAt(random.nextInt(Charact.CHARACTRUS.getCharect().length())));
        }
        return sb.toString();
    }

    /**
     * генерация рандомного имени из eng символов
     *
     * @return строку из eng символов
     */
    public static String randomNameEng() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(Charact.CHARACTENG.getCharect().charAt(random.nextInt(Charact.CHARACTENG.getCharect().length())));
        }
        return sb.toString();
    }

    /**
     * генерация реального имени из массива имен
     *
     * @return строку из массива
     */
    public static String randomRealName(Names name) {
        Random random = new Random();
        return name.data[random.nextInt(name.data.length)];
    }

    /**
     * метод выборки имени из файла
     * @throws FileNotFoundException
     */
    public static void nameFromFile() throws FileNotFoundException {
        String separator = File.separator;
//        //благодаря сепаратору код запустится на любой операц системе (т к путь прописывается по-разному)
        String path = separator + "Users" + separator + "maryiapavireyeva" + separator + "Documents" + separator + "NameFromFile.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        Person person1 = new Person("Mike", "234", randomRealName(Names.REALPERSONNAME));
        System.out.println(person1.getName());

        nameFromFile();

    }
}
