package Massive;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        int n = 6;
        int mass[][] = new int[n][n];
        int[] massMax = new int[n];
        for (int a = 0; a < mass.length; a++) {
            for (int b = 0; b < mass[a].length; b++) {
                mass[a][b] = (int) (Math.random() * 100 + 1);
            }
        }
        print(mass);

        int max;
        int min;

        for (int a = 0; a < mass.length; a++) {
            max = mass[a][0];
            min = mass[a][0];
            for (int b = 0; b < mass[a].length; b++) {
                if (max < mass[a][b]) {
                    max = mass[a][b];
                }
                if (min > mass[a][b]) {
                    min = mass[a][b];

                }
            }
            massMax[a] = max;
            System.out.println("MAX: " + max + " " + "MIN: " + min);
        }
        print(massMax);
        System.out.println();


        int temp;
        for (int a = 0; a < massMax.length; a++) {
            for (int b = 1; b < massMax.length - a; b++) {
                if(massMax[b - 1] >  massMax[b]) {
                    temp = massMax[b];
                    massMax[b] = massMax[b - 1];
                    massMax[b - 1] =  temp;
                }
            }

        }
        print(massMax);
    }

    private static void print(int[] massMax) {
        for (int valueCell : massMax) {
            System.out.print(" " + valueCell);
        }
    }

    private static void print(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            print(mass[i]);
            System.out.println();

        }
    }
}

