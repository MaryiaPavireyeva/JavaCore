package hw7switchcase;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Switch {

    public static void dayOfWeek(int number) {  //метод задачи 11
        switch (number) {
            default:
                System.out.println("Schedule is not found" +number);
            case 1:
                System.out.println("Monday schedule");
//                break;
            case 2:
                System.out.println("Tuesday schedule");
//                break;
            case 3:
                System.out.println("Wednesday schedule");
//                break;
            case 4:
                System.out.println("Thursday schedule");
//                break;
            case 5:
                System.out.println("Friday schedule");
//                break;
            case 6:
                System.out.println("Saturday schedule");
//                break;
            case 7:
                System.out.println("Sunday schedule");
//                break;
        }
    }


    public static void main(String[] args) {
        System.out.println("Восьмое задание:");
        int money = 32;
        if (money % 10 == 1) {
            System.out.println(money + " рубль");
        } else if (money % 10 >= 2 && money % 10 <= 4) {
            System.out.println(money + " рубля");
        } else {
            System.out.println(money + " рублей");
        }


        System.out.println("Девятое задание:");
        Calendar date1 = new GregorianCalendar(2017, Calendar.JUNE, 30);
        date1.add(Calendar.DATE, +1);
        System.out.println("день: " + date1.get(Calendar.DATE) + " месяц: " + date1.get(Calendar.MONTH) + " год: " + date1.get(Calendar.YEAR));

        System.out.println("Деcятое задание:");
        int a = 1;
        int b = 2;
        int c = 1;
        int d = 2;
        int e = 4;
        int f = 6;

        if (a + c <= e && d <= f && b <= f) {
            System.out.println("ok");
        } else if (b + d <= e && c <= f && a <= f) {
            System.out.println("ok");
        } else if (a + c <= f && d <= e && b <= e) {
            System.out.println("ok");
        } else if (b + d <= f && c <= e && a <= e) {
            System.out.println("ok");
        } else {
            System.out.println("ne ok");
        }

        System.out.println("Одиннадцатое задание:");
        dayOfWeek(123);

        System.out.println("Пятнадцатое задание:");

        int n = 1;
        for (int i = 50; i <= 70; i++) {
            for (int j = 2; j <= i; j++) {
                if (j < i && i % j == 0) {
                    break;
                }

                if (i % j == 0) {
                    if (n == 2) {
                        System.out.println(i + "- простое число");
                        return;
                    }
                    n++;
                }
            }
        }
    }
}