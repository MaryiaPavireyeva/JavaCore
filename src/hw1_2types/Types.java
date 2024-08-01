package hw1_2types;

public class Types {
    public static void main(String[] args) {
        byte min_byte = -128;
        byte max_byte = 127;
        short min_short = -32768;
        short max_short = 32767;
        int min_int = -2147483648;
        int max_int = 2147483647;
        double min_long = -9.223372036854775808;
        // long min_long = -9223372036854775808l;
        double max_long = 9.223372036854775807;
        System.out.println("Min byte: " + min_byte +
                "\nMax byte: " + max_byte +
                "\nMin short: " + min_short +
                "\nMax short: " + max_short +
                "\nMin int: " + min_int +
                "\nMax int: " + max_int +
                "\nMin long: " + min_long +
                "\nMax long: " + max_long +
                "\nMin float: " + Float.MIN_VALUE +
                "\nMax float: " + Float.MAX_VALUE +
                "\nMin double: " + Double.MIN_VALUE +
                "\nMax double: " + Double.MAX_VALUE
        );
    }
}
