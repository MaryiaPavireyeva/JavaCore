package collection.map;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {

        //ключ = слово
        //значение = найденное кол-во повторений
        Map<String, Integer> data = new HashMap<>();

        String text = "Привет, как дела!\nПривет, у меня хорошо!\nПочему ты всегда первый пишешь привет";
        text = text.toLowerCase();

        String[] parts = text.split("[,| | ! |\\n]+");

        System.out.println(Arrays.toString(parts));
        for (String part : parts) {
            Integer count = data.get(part);
            if (count == null) {
               count = 0;
            }
            count += 1;

                data.put(part, count);
            }
        System.out.println(data);

    }
}
