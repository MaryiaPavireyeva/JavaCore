package generic;

public class BoxGeneric<T> {
    private T item;


    public T getItem() {
        //буква Т указывает везде тип объекта везде где раньше был Object. Буква может быть любая, может слово
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
