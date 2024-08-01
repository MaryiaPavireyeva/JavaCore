package generic;

public class MyBox <T> {
    private T item;
    public MyBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        MyBox<String> myBox = new MyBox("hello");
        String item1 = myBox.getItem();
        System.out.println(item1);
        MyBox<Integer> myBox2 = new MyBox(456);
        Integer item2 = myBox2.getItem();
        System.out.println(item2);
    }
}
