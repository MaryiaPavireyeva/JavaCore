package cycle;

public class Cycle {
    public static final int SALARY_MIN = 300;
    public static final int SALARY_MAX = 1500;
    public static final int SIZE_MASS = 10;

    private static void checkSalary(int salary) {
        if (salary > SALARY_MAX) {
            System.out.println("Зарплата больше среднего");
        } else if (salary > SALARY_MIN) {
            System.out.println("Зарплата средняя");
        } else {
            System.out.println("Зарплата меньше среднего");
        }
    }

    public static void main(String[] args) {
        int[] mass = new int[SIZE_MASS];  //создай 10 ячеек и в каждой будет 10 int. Массивы начинаются с 0. 10ка это кол-во ячеек
//        for (int i = 0; i < mass.length; i++) { //int i = 0 начальная точка. i <= mass.length точка выхода. i++ как работаем с эл-том
//            mass[i] = i; //обратиться к индексу массива mass[2]
//    }
//        for (int i = 0; i < SIZE_MASS; i++) {
//            System.out.println(mass[i]);
//        }
//
//        int index = 0; //то же самое как for только переменную входа выносим до цикла
//        while (index < mass.length) {
//            System.out.println(mass[index]);
//            index = index + 2;
//        }
//
//        int indexDoWhile = 0;
//        do {
//            System.out.println(mass[indexDoWhile]);
//            indexDoWhile++;
//        }
//        while (indexDoWhile < mass.length);


//        for (int i = 0; i < mass.length; i++) {
//            if (i == 0) {
//                mass[i] = i + 1;
//            } else {
//                mass[i] = mass[i - 1] + 2;
//            }
//            System.out.println(mass[i]);
//        }
//
//        System.out.println("while");
//
//        int index1 = mass.length - 1;
//        while (index1 >= 0) {
//            System.out.println(mass[index1]);
//            index1--;
//        }
//
//        System.out.println("while do");
//
//        int a = 1;
//        do {
//            System.out.println(a);
//            a = a + 2;
//        }
//        while (a < mass.length);
//
//        for (int i = 0; i < mass.length; i++) {
//            if (i == 0) {
//                break; //пропуск шага
//                // выйти из цикла break
//            }
//            if (i == 0) {
//                mass[i] = i + 1;
//            } else {
//                mass[i] = mass[i - 1] + 2;
//            }
//
//            checkSalary(300);
//            checkSalary(300);
//            checkSalary(1600);

        System.out.println("new line");

        for (int i = 0; i < mass.length; i++) {  //вывести все кроме 5 и 7
            if (i == 5 || i == 7) {
                    continue;  //пропуск шага
            }
                    // выйти из цикла break
            //return не идет дальше по методу
                    mass[i] = i;
            System.out.println(" " + mass[i]);
                }
            }
        }





