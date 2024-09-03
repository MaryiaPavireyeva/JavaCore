package hw_Lists5;

public class Animal implements Comparable<Animal>{
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
    public int compareTo(Animal o) {
        return age;
    }
}
