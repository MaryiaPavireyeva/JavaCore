import hw12regex.Main;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    private int number, hour;

    public Main1(int number, int hour) {
        this.number = number;
        this.hour = hour;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj instanceof Main1) {
            Main1 m = (Main1) obj;
            return number == m.number && hour == m.hour;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return number + hour;
    }

    public static void main(String[] args) {
        Main1 object1 = new Main1(11, 2);
        int hCode;
        hCode = object1.hashCode();
        System.out.println(hCode);

        Main1 object2 = new Main1(11, 2);
        int hCode2;
        hCode2 = object2.hashCode();
        System.out.println(hCode2);

        boolean eq = object1.equals(object2);
        System.out.println(eq);

        List<String> data = new ArrayList<>();
        data.add("Anton");
        data.add(1, "Dima");
        List<String> data2 = new ArrayList<>(data);
        data2.add(2, "Masha");
        System.out.println(data);
        System.out.println(data2);
    }
}

