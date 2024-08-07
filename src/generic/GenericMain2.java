package generic;

public class GenericMain2 {
    public static void main(String[] args) {
        BoxGeneric<Object> box1 = new BoxGeneric<>();

        box1.setItem("Hello");
        box1.setItem(10);

        BoxGeneric<Object> box2 = new BoxGeneric<>();

        box2.setItem("Hi");
        box2.setItem(10);
    }
}
