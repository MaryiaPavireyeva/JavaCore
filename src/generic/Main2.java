package generic;

public class Main2 {

    public static void print1(BoxGeneric<?> box) {  //wildcard
        System.out.println(box.getItem());
    }

    public static void print2(BoxGeneric<? extends Number> box) { //wildcard
        System.out.println(box.getItem());
    }

    public static void print3(BoxGeneric<? super Double> box) { //wildcard
        System.out.println(box.getItem());
    }


    public static void main(String[] args) {
        BoxGeneric<Integer> box1 = new BoxGeneric<>();
        BoxGeneric<Double> box2 = new BoxGeneric<>();
        BoxGeneric<String> box3 = new BoxGeneric<>();
        BoxGeneric box4 = new BoxGeneric();
        BoxGeneric<Number> box5 = new BoxGeneric<>();

        print1(box1);
        print1(box2);
        print1(box3);
        print1(box4);

        print2(box1);
        print2(box2);
//        print2(box3);
        print2(box4);
        print2(box5);

//        print3(box1);
        print3(box2);
//        print3(box3);
        print3(box4);
        print3(box5);

    }
}
