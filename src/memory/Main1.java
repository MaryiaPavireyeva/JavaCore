package memory;

import java.util.concurrent.TimeUnit;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        for (long i = 0; i < Long.MAX_VALUE; i++) {
            int[] data = new int[3];
            System.out.println(data);
            TimeUnit.MILLISECONDS.sleep(1000);
        }
//        System.out.println(data);
    }
}
