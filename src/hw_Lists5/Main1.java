package hw_Lists5;

import hw_Lists5.dto.Person;

import java.io.IOException;
import java.util.*;

public class Main1 {

    public static void main(String[] args) throws IOException {

//        IPasswordValidator passwordValidator = new LengthPasswordValidator();
//
        Person person = new Person(RandomStringNameGenerator.randomName(), "12343", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME));
        Person person2 = new Person(RandomStringNameGenerator.randomName(), "12343", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME));
//
//        if (passwordValidator.isValid(person.getPassword())) {
//            throw new IllegalArgumentException("Password must be between 5 and 10");
//        }
//
//
//        Person person2 = new Person(RandomStringNameGenerator.randomNameEng(),"1234133333333", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME));
//        System.out.println(person2);


        List<Person> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add(new Person(RandomStringNameGenerator.randomName(), "1234133333333", RandomStringNameGenerator.randomRealName(Names.REALPERSONNAME)));
        }
//
        for (Person name : data) {
            System.out.println(name.getName());
        }

        //работа интерфейса иттератор. не такая расширенна как listiterator
        Iterator<Person> iter = data.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //итератор удалил все значения в листе
        Iterator<Person> iter2 = data.iterator();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
        }
        System.out.println(data);

        //работа интерфейса лист итератор спецаильно созданного для LinkedList, ArrayList и др. расширяет методы простого итератора
        ListIterator<Person> listiter = data.listIterator();
        while (listiter.hasNext()) {
            System.out.println(listiter.next());
        }
        listiter.set(person);

//итератор удалил все значения в листе
        ListIterator<Person> listiter2 = data.listIterator();
        while (listiter2.hasNext()) {
            listiter2.next();
            listiter2.remove();
        }
        System.out.println(data);

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
