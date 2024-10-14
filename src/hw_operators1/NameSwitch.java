package hw_operators1;

import java.util.Objects;

public class NameSwitch {
    private static void name(String name) {

        switch (name) {
            case "Вася":
                System.out.println("Привет!" + "\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }

    public static void main(String[] args) {
        name("Анастасия");
    }
}
