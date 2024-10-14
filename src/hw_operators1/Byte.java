package hw_operators1;

import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {
//1.1 and 1.2
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //11 -1011
        System.out.println("Enter the second number");
        int b = scanner.nextInt(); //22 - 10110

        if(a > 10 && b > 10) {
            System.out.println("a and b more than 10");
        } else if(a > 10 || b > 10){
            System.out.println("a or b more than 10");
        } else {
            System.out.println("a and b less than 10");

        }

    }
}
