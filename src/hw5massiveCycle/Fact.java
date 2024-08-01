package hw5massiveCycle;
import java.math.BigInteger;

public class Fact {
    public static BigInteger factorial(int n) {
        BigInteger ret = BigInteger.valueOf(1);
        int i = 1;
        do {
            ret = ret.multiply(BigInteger.valueOf(i));
            i++;
        } while (i <= n);
        return ret;
    }

    public static void main(String[]args){
        System.out.println(factorial(25));
    }
}

