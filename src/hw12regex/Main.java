package hw12regex;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //27 задача
        String text = scanner.nextLine();
        text = text.trim();
        String text2 = text.replaceAll(" +", " ");
        System.out.println("Line: " + text2);
        int count = 0;
        if (text2.length() != 0) {
            count++;
            for (int i = 0; i < text2.length(); i++) {
                if (text2.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println("Вы ввели " + count + "слов(а) ");


            Scanner scanner1 = new Scanner(System.in); //28 задача
            String text3 = scanner1.nextLine();
            String p = text3.replaceAll("<p[^>]+>", "<p>");
            System.out.println(p);
        }
    }
}
