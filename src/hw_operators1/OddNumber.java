package hw_operators1;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println("Odd number " + number);
        } else
            System.out.println("Not add number " + number);
    }
}
