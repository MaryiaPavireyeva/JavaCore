package hw_dataContainer4;

public class DataContainer <T>{
    private  T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        int a = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                data[i] = item;
                a = i;
            } else if(item == null) {
                return -1;
            }
        }
        return a;
    }

    public T[] getItems() {
        return data;
    }
}
