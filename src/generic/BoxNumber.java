package generic;

public class BoxNumber<T extends Number> {  //ограничен класс цифрами
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public double doublevalue() {
        return this.item.doubleValue();
    }
}
