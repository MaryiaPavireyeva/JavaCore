package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMain1 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Integer val = 11;
        Integer val2 = 12;

        System.out.println("size: " + data.size());
        for (int i = 0; i < 100; i++) {
            data.add(val);
        }
        System.out.println("after size: " + data.size());

        data.add(0, val2);//положили значение второго объекта в позицию 0
        data.add(2, val2);

        data.set(0, val); //заменяет значение на какой-то позиции
        data.addAll(data);

        data.remove(0);

        for (Integer datum : data) {   //data.for
            System.out.println(datum);
        }
        System.out.println("after size: " + data.size());

    }
}
