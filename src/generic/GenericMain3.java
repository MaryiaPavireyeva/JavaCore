package generic;

public class GenericMain3 {
    public static void main(String[] args) {
        BoxGeneric<String> box1 = new BoxGeneric<>();

        box1.setItem("sdf");

        BoxNumber<Number> box2 = new BoxNumber<>();

        box2.setItem(Integer.valueOf(55));
    }
}
