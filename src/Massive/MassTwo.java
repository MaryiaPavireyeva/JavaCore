package Massive;

public class MassTwo {
    public static final int MASS_SIZE = 10;
    public static void main(String[] args) {
        int [] mass = new int[MASS_SIZE];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i;
        }
        int count = 0;
        for (int value : mass) {
            System.out.println(value);
            count = count + value;
        }
            System.out.println(count);
        }
    }
