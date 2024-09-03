package hw_Lists5;

import java.util.Comparator;

public class Animal implements Comparator<Animal> {
    private int age;
    private String nick;

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge().;
    }
}
