package exception;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("1");
        System.out.println("2");
        int a = console.nextInt();
        System.out.println("3");
        int b = console.nextInt();

        int c = 0;
        try {
            c = a / b;
            System.out.println("Answer " + c);
        } catch (ArithmeticException e) {
            System.out.println("error");
        }
    }
    }
