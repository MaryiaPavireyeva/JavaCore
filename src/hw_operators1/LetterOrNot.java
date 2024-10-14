package hw_operators1;

import java.util.Scanner;

public class LetterOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        char a = letter.charAt(0);

        if (Character.isLetter(a)){
            System.out.println("letter");
        }else {
            System.out.println("not letter");
        }
    }
}
