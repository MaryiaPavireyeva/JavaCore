package consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        //Consumer интерфейс используется в случае, если необходимо передать объект на вход и произвести
        // над ним некоторые операции не возвращая результат.
        // Самый частый случай использования этого интерфейса - это вывод на консоль.
    }
}
