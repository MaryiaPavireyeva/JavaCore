package hw_Lists5;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    private String nick;
    private String password;
    private String name;


    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        return nick.hashCode() + name.hashCode() + password.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj instanceof Person) {
            Person m = (Person) obj;
            return nick == m.nick && password == m.password && name == m.name;
        }
        return false;
    }

    /**
     *метод сравнивает длину пароля пользователей
     * @param o1 the object to be compared.
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }

}

class PersonPasswordComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getPassword().length() > o2.getPassword().length())
            return 1;
        else if(o1.getPassword().length() < o2.getPassword().length())
            return -1;
        else
            return 0;
    }
}

    class PersonNicknameComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
