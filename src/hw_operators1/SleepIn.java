package hw_operators1;

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;
    }


    public static void main(String[] args) {
        System.out.println(sleepIn(true, true));

    }
}
