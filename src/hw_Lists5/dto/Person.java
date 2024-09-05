package hw_Lists5.dto;

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

    public void setPassword(String password) {
        this.password = password;
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
     * метод сравнивает длину пароля пользователей
     *
     * @param o1 the object to be compared.
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length() - o2.getPassword().length();
    }

}
