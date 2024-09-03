package hw_Lists5;

import java.util.Random;

public class RandomStringNameGenerator {
    private static final String CHARACT = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final String CHARACTRUS = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъыьэюя";
    private static final String[] REALNAME = {"Misha", "Katia", "Pasha", "Dasha"};

    /**
     * генерация рандомного имени из рандомных символов
     * @return строку из рандомных символов
     */
    public static String randomName() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(CHARACT.charAt(random.nextInt(CHARACT.length())));
        }
        return sb.toString();
    }

    /**
     * генерация рандомного имени из русских символов
     * @return строку из русских символов
     */
    public static String randomNameRus() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(CHARACTRUS.charAt(random.nextInt(CHARACTRUS.length())));
        }
        return sb.toString();
    }

    /**
     * генерация реального имени из массива имен
     * @return строку из массива
     */
    public static String randomRealName(){
        Random random = new Random();
        return REALNAME[random.nextInt(REALNAME.length)];
    }

    public static void main(String[] args) {
        Person person1 = new Person("Mike", "234", randomRealName());
        System.out.println(person1.getName());

    }
}
