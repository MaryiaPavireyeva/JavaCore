package hw5massiveCycle;
public class Final {
    public static int sum;
    public static int returnNumber(int a, int b) {
        sum = (a + b) + (a * b);
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(returnNumber(1,6));


        long sec = 1000001233;
        int min = (int) (sec / 60 % 60);
        int hour = (int) (sec / (60 * 60) % 24);
        int day = (int) (sec / (60 * 60 * 24) % 7);
        int week = (int) (sec / (60 * 60 * 24 * 7) % 4);
        int sec2 = (int) (sec % 60);
        System.out.println(week + " недель " + day + " дней " + hour + " час " + min + " минут " + sec2 + " секунд ");

    }
}
