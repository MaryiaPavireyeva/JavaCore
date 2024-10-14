package hw_operators1;

public class AverageNumber {
    public static void main(String[] args) {
        int x = 4;
        int y = 4;
        int z = 1;

        if (( x >= y & x <= z) || (x <= y & x >= z)) {
            System.out.print(x);
        } else  if ((y >= x & y <= z) || (y <= x & y >= z)){
            System.out.println(y);
        } else
            System.out.println(z);
    }
}

