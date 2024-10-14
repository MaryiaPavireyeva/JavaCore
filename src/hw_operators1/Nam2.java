package hw_operators1;

import java.util.Objects;

public class Nam2 {
    private static void name(String name) {
        String defaultName1 = "Вася";
        String defaultName2 = "Анастасия";

        if(Objects.equals(name, defaultName1)) {
            System.out.println("Привет!" + "\nЯ тебя так долго ждал");
        }else if (Objects.equals(name, defaultName2)) {
            System.out.println("Я тебя так долго ждал");
        } else
            System.out.println("Добрый день, а вы кто?");
    }

    public static void main(String[] args) {

    }
}
