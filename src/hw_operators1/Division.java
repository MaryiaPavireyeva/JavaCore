package hw_operators1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println("divided");
        } else {
            System.out.println("not divided");
        }

    }
}
