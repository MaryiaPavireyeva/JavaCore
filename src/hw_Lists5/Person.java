package hw_Lists5;

public class Person {
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
}
