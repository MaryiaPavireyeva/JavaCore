import org.junit.jupiter.api.Test;

import java.util.Objects;

public class hashcode {

    int a = 6;
    int b;

    hashcode(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hashcode hashcode = (hashcode) o;
        return a == hashcode.a && b == hashcode.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public static void main(String[] args) {
        hashcode object = new hashcode(5, 10);
        hashcode object2 = new hashcode(5, 10);
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

        System.out.println(object.equals(object2));



    }
}
