package hw_dataContainer4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {
    private T[] data;
    int a = 0;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
//        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                a = i;
                break;
            }
            if (item == null) {
                return -1;
//            } else if (data.length <= i) {
//                data = Arrays.copyOf(data, data.length + 5);
            }
        }
        return a;
    }


    public T get(int index) {
        if (data[index] != null)
            return data[index];
        else
            return null;
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        for (int i = 0; i < data.length; i++) {
            if (i == index) {
                data[i] = null;
                for (int j = i + 1; j <= data.length - 1; j++) {
                    data[j - 1] = data[j];
                    data[j] = null;
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                data[i] = null;
                for (int j = i + 1; j <= data.length - 1; j++) {
                    data[j - 1] = data[j];
                    data[j] = null;
                }
                data = Arrays.copyOf(data, data.length - 1);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if(data == null)
            return "null";
        if(data.length == 0)
            return "[]";
        String first = "[";
        for (int i = 0; i < data.length; i++) {
            if(data[i] != null) {
               if(i == data.length - 1){
                   first += data[i].toString();
               }else
                   first += data[i].toString() + ", ";
            }
        }
        String second = "]";
        return first + second;
    }


    public static void main(String[] args) {
        Integer[] data1 = new Integer[3];
        Integer data4 = 123;
        Integer data5 = null;
    DataContainer<Integer> data2 = new DataContainer<>(data1);

    data2.add(123);
    data2.add(2);
    data2.add(3);
        System.out.println(data2.toString());
    System.out.println(data2.get(1));
    System.out.println(Arrays.toString(data2.getItems()));
    System.out.println(data2.delete(1));
    System.out.println(Arrays.toString(data2.getItems()));
    System.out.println(data2.delete(data5));
    System.out.println(Arrays.toString(data2.getItems()));
    }
}
