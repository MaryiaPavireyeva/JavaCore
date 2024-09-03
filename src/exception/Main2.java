package exception;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            data.add(i);
        }
    }
}
