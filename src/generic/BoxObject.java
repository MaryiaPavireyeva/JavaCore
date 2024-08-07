package generic;

public class BoxObject {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }


    //как исправить на Generic
    //в обджекте везде проставить <T> и тогда в коде везде подсветит, что надо сделать приведение типа
}
