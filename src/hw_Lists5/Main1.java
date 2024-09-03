package hw_Lists5;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        List<Person> data = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            data.add(new Person(RandomStringNicknameenerator.randomName(), "123", RandomStringNameGenerator.randomRealName()));
        }
        System.out.println();

        List<Person> data2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            data2.add(new Person(RandomStringNicknameenerator.randomName(), "123", RandomStringNameGenerator.randomRealName()));
        }
        System.out.println();

        Set<Person> data3 = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            data3.add(new Person(RandomStringNicknameenerator.randomName(), "123", RandomStringNameGenerator.randomRealName()));
        }
        System.out.println();

        Set<Person> data4 = new TreeSet<>();
        for (int i = 0; i < 100000; i++) {
            data4.add(new Person(RandomStringNicknameenerator.randomName(), "123", RandomStringNameGenerator.randomRealName()));
        }
        System.out.println();
    }
}
