package hw_Lists5;

import hw_Lists5.dto.Person;
import hw_Lists5.validators.IPasswordValidator;
import hw_Lists5.validators.LengthPasswordValidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main1 {

    public static void main(String[] args) throws IOException {

        IPasswordValidator passwordValidator = new LengthPasswordValidator();

        Person person = new Person(RandomStringNameGenerator.randomName(),"12343", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME));

        if (passwordValidator.isValid(person.getPassword())) {
            throw new IllegalArgumentException("Password must be between 5 and 10");
        }


        Person person2 = new Person(RandomStringNameGenerator.randomNameEng(),"1234133333333", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME));
        System.out.println(person2);


        List<Person> data = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            data.add(new Person(RandomStringNameGenerator.randomName(),"1234133333333", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME)));
        }

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).getName());
        }


//        List<Person> data2 = new LinkedList<>();
//        for (int i = 0; i < 100000; i++) {
//            data2.add(new Person(RandomStringNameGenerator.randomName(), "123", RandomStringNameGenerator.randomRealName(Names.REALNICKNAME)));
//        }
//
//        Set<Person> data3 = new HashSet<>();
//        for (int i = 0; i < 100000; i++) {
//            data3.add(new Person(RandomStringNameGenerator.randomName(), "123", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME)));
//        }
//
//
//        Set<Person> data4 = new TreeSet<>();
//        for (int i = 0; i < 100000; i++) {
//            data4.add(new Person(RandomStringNameGenerator.randomName(), "123", RandomStringNameGenerator.randomRealName(Names.REALNICKNAME)));
//        }
//        System.out.println();
    }
}
