package hw5massiveCycle;
public class NewClass {
    public static final int SIZE_MASS = 10;

    public static void main(String[] args) {
        System.out.println("Первый вариант заполнения");
        int[] mass = new int[SIZE_MASS];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        mass[3] = 4;
        mass[4] = 5;
        mass[5] = 6;
        mass[6] = 7;
        mass[7] = 8;
        mass[8] = 9;
        mass[9] = 10;

        for (int i = 0; i < SIZE_MASS; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(mass[i]);
            }
        }

        System.out.println("Второй вариант заполнения");

        int[] mass2 = {945, 832, 712, 433, 55, 63, 73, 84, 94, 11};

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(mass2[i]);
            }

        }
        System.out.println("Третий вариант заполнения");

        int[] mass3 = new int[SIZE_MASS];

        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = 1 + (int) (Math.random() * 20);
            if (i % 2 == 0 && i != 0) {
                System.out.println(mass3[i]);
            }

        }

    }
}
