package generic;

public class GenericMain {
    public static void main(String[] args) {
        BoxGeneric<String> box1 = new BoxGeneric<>(); //тип переменной будет указывается при объявлении объекта
        box1.setItem("10");

        String item1 = box1.getItem();
//        Integer item1int = (Integer) box1.getItem();

        BoxGeneric<Integer> box2 = new BoxGeneric<>();
        box2.setItem(10); //в скобках подсказывает какого типа должна быть переменная
        int item2 = box2.getItem();

        System.out.println(item1.length());
    }
}
