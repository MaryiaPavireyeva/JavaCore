import java.util.Scanner;

public class TaskFromAnotherGroup {

    public static void main(String[] args) {
        //increment
        int a = 10;
        int b = ++a; //сначала а = 11, потом b присвоит 11
        int c = a++; //a = 12, c = 11
        int d = a++ + a; //a = 12 d = 12+13, a = 13
        int z = a++ + ++a; // a++ = 13, a = 14, ++a = 15, z = 28

        //operators
//        нечетное число определить
        Scanner scanner1 = new Scanner(System.in);
        int first = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int second = scanner2.nextInt();
        if (first % 2 == 0 && second % 2 != 0) {
            System.out.println(first + " четное");
        } else if (first % 2 != 0 && second % 2 == 0) {
            System.out.println(second + " четное");
        } else if (first % 2 == 0 && second % 2 == 0) {
            System.out.println(first + " " + second + " оба четные");
        }
        else {
            System.out.println("нет четных");
        }

        //среди трех чисел найти среднее
        Scanner scannerA = new Scanner(System.in);
        int first1 = scannerA.nextInt();
        Scanner scannerB = new Scanner(System.in);
        int second2 = scannerB.nextInt();
        Scanner scannerC = new Scanner(System.in);
        int third3 = scannerC.nextInt();
        if (second2 > first1 && second2 < third3 && third3 > first1) { //1
            System.out.println(second2);
        } else if (first1 > second2 && first1 < third3 && second2 < third3) { //2
            System.out.println(first1);
        } else if (first1 < second2 && third3 < second2 && first1 > third3) { //3
            System.out.println(first1);
        } else if (third3 > second2 && second2 < first1 && third3 < first1) { //4
            System.out.println(third3);
        } else if (second2 < first1 && second2 > third3 && first1 > third3) { //5
            System.out.println(second2);
        } else {
            System.out.println("nothing");
        }

        //проверка делимости одного числа на другое
        Scanner scannerAA = new Scanner(System.in);
        int first11 = scannerAA.nextInt();
        Scanner scannerBB = new Scanner(System.in);
        int second22 = scannerBB.nextInt();
        if (first11 % second22 == 0) {
            System.out.println("делиться без остатка");
        } else {
            int ostatok = first11 % second22;
            System.out.println("остаток от деления" + ostatok);
        }

        //год високосный
        Scanner year = new Scanner(System.in);
        int year1 = year.nextInt();
        if (year1 == 365) {
            System.out.println("regular year");
        } else if (year1 >= 366){
            System.out.println("високосный");
        } else {
            System.out.println("less than year");
        }
    }
}
