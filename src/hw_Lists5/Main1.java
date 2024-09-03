package hw_Lists5;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        List<Person> data = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            data.add(new Person(RandomStringNameGenerator.randomName(), "123", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME)));
        }

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getName());
        }


        List<Person> data2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            data2.add(new Person(RandomStringNameGenerator.randomName(), "123", RandomStringNameGenerator.randomRealName(Names.REALNICKNAME)));
        }

        Set<Person> data3 = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            data3.add(new Person(RandomStringNameGenerator.randomName(), "123", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME)));
        }


        Set<Person> data4 = new TreeSet<>();
        for (int i = 0; i < 100000; i++) {
            data4.add(new Person(RandomStringNameGenerator.randomName(), "123", RandomStringNameGenerator.randomRealName(Names.REALNICKNAME)));
        }
        System.out.println();
    }
}
