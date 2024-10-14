package hw_operators1;

public class PriorityOperations {
    public static void main(String[] args) {
        int a = 5 + 2 / 8;
        System.out.println(a); //результат 5 а не 2.25 т к тип переменной int целочисленный

        int b = (5 + 2) / 8;
        System.out.println(b); //результат 0 а не 0.875 т к тип переменной int целочисленный

        int a2 = 2;
        int a1 = 8;
        int c = (5 + a2++) / a1;
        System.out.println(c); //результат 0 а не 1 т к к а2 прибавили 1 после сложения, Сейчас а2 = 3

        int d = (5 + a2++) / --a1;
        System.out.println(d); //результат 1 т к а2 уже было = 3м, после этого а2 стал =4, а а1 = 7

        int e = (5 * 2 >> a2++) / --a1;
        System.out.println(e);

        int f = (5 + 7 > 20 ? 68 : 22 * 2 >> a2++) / --a1; //5 + 7 > 20 ? 68 : 22 * 2 >> a2++ тернарное выражение где если 5 + 7 > 20 тру, тогда выводим 68, если фолс выполняется 22 * 2 >> a2++
        System.out.println(f);

//        int j = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a2++) / --a1;
//        System.out.println(j); //смешиваются два типа из-за  68 >= 68, для тернарного оператора нужно иметь два варианта одинаковых типа в результатах

        boolean g = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(g);

        boolean h = true && false;
        System.out.println(h);
    }
}
