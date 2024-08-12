package collection;

import java.util.Arrays;
import java.util.Scanner;

//необходимо наполнять массив числами
//положительные числа вводятся через консоль
//заранее неизвестно кол-во вводимых чисел
//ввод чисел прекращается при вводе числа отрицательного
public class Main2 {
    public static void main(String[] args) {
        Integer[] data = new Integer[0];
        Scanner scan = new Scanner(System.in);
        int input;
        int index = 0;

        do {
            input = scan.nextInt();
            if (input >= 0) {
                if (data.length <= index) {
                    Integer[] tmp = new Integer[data.length + 1];
                    for (int i = 0; i < tmp.length; i++) {
                        tmp[i] = data[i];
                    }
                    data = tmp;
                }

                data[index++] = input;
            }
        }
            while (input >= 0) ;
            System.out.println(Arrays.toString(data));
        }
        }
