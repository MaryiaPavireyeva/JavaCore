package hw_Lists5;

import java.util.Random;

public class RandomStringNameGenerator {

    /**
     * генерация рандомного имени из рандомных символов
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
     * @return строку из массива
     */
    public static String randomRealName(Names name){
        Random random = new Random();
        return name.data[random.nextInt(name.data.length)];
    }

    public static void main(String[] args) {
        Person person1 = new Person("Mike", "234", randomRealName(Names.REALPERSONNAME));
        System.out.println(person1.getName());

    }
}
