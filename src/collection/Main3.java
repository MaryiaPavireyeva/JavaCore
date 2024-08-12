package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//необходимо наполнять массив числами
//положительные числа вводятся через консоль
//заранее неизвестно кол-во вводимых чисел
//ввод чисел прекращается при вводе числа отрицательного
public class Main3 {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int input;
        int index = 0;

        do {
            input = scan.nextInt();
            if (input >= 0) {
                data.add(input);
            }
        }
            while (input >= 0) ;
            System.out.println(data);
        }
    }

