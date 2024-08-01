package hw1_2types;

public class NumbersCalculation {
    public byte minByte = -128;
    public byte maxByte = 127;
    public short minShort = -32768;
    public short maxShort = 32767;
    public int minInt = -2147483648;
    public int maxInt = 2147483647;
    public long minLong = -9223372036854775808L;
    public long maxLong = 9223372036854775807L;

    public void increment() {
        this.maxByte++;
        this.maxShort++;
        this.maxInt++;
        this.maxLong++;
    }

    public void decrement() {
        this.minByte--;
        this.minShort--;
        this.minInt--;
        this.minLong--;
    }

    public void printNumbers() {
        System.out.println("All types" +
                "\nMin byte: " + this.minByte +
                "\nMax byte: " + this.maxByte +
                "\nMin short: " + this.minShort +
                "\nMax short: " + this.maxShort +
                "\nMin int: " + this.minInt +
                "\nMax int: " + this.maxInt +
                "\nMin long: " + this.minLong +
                "\nMax long: " + this.maxLong +
                "\nMin float: " + Float.MIN_VALUE +
                "\nMax float: " + Float.MAX_VALUE +
                "\nMin double: " + Double.MIN_VALUE +
                "\nMax double: " + Double.MAX_VALUE
        );
    }

    public static void main(String[] args) {
        NumbersCalculation print = new NumbersCalculation();
        print.printNumbers();
        print.increment();
        System.out.println("Max byte + 1: " + print.maxByte +
                "\nMax short + 1: " + print.maxShort +
                "\nMax int + 1: " + print.maxInt +
                "\nMax long + 1: " + print.maxLong);
        print.decrement();
        System.out.println("Min byte - 1: " + print.minByte +
                "\nMin short - 1: " + print.minShort +
                "\nMin int - 1: " + print.minInt +
                "\nMin long - 1: " + print.minLong);
    }
}