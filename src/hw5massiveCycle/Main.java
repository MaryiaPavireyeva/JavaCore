package hw5massiveCycle;
import java.math.BigInteger;

public class Main {
    public static int sum;


    public static int getMath(int d, int e) {    //метод задачи 4
        sum = (d + e) + (d * e);
        return sum;
    }

    public static void checkParam(int one) {    //метод задачи 6
        boolean lastCharacter7 = true;
        boolean anotherLastCharacter = false;
        int lastCharacter = 7;
        if (lastCharacter == one % 10) {
            System.out.println(lastCharacter7);
        } else {
            System.out.println(anotherLastCharacter);
        }
    }

    public static BigInteger factorial(int n) {  //метод задачи 13
        BigInteger ret = BigInteger.valueOf(1);
        int i = 1;
        do {
            ret = ret.multiply(BigInteger.valueOf(i));
            i++;
        } while (i <= n);
        return ret;
    }

    public static void main(String[]args){
        System.out.println(getMath(2, 6));   //результат задачи 4

        System.out.println("next task 5");

        long sec = 1000001233;    //результат задачи 5
        int min = (int) (sec / 60 % 60);
        int hour = (int) (sec / (60 * 60) % 24);
        int day = (int) (sec / (60 * 60 * 24) % 7);
        int week = (int) (sec / (60 * 60 * 24 * 7) % 4);
        int secFinal = (int) (sec % 60);
        System.out.println(week + " недель " + day + " дней " + hour + " час " + min + " минут " + secFinal + " секунд ");

        System.out.println("next task 6");
        checkParam(27);  //результат задачи 6

        System.out.println("next task 7");
        int a = 111;   //результат задачи 7
        int b = 111;
        int r = 11;
        if (2 * r >= Math.hypot(a, b))
        {  //формула
            System.out.println("можно");
        } else {
            System.out.println("нельзя");
        }

        System.out.println("next task 12");
        int i = 1;     //результат задачи 12
        int fact = 1;
        while (i <= 10) {
            fact = fact * i;
            i++;
            System.out.println(fact);
        }

        System.out.println("next task 13");
        System.out.println(factorial(25));


        System.out.println("next task 14");

        long number = 100000;     //результат задачи 14
        int sum = 0;
        do { sum += number % 10;   //получение последней цифры и добавление к сумме
            number /= 10; //удаление последней цифры
        }
        while (number > 0);
        System.out.println(sum);

    }
}
