package Massive;

public class Mass {
    public static final int MASS_SIZE = 10;

    public static void main(String[] args) {
        int[] massInt = new int[MASS_SIZE];
        for (int i = 0; i < massInt.length; i++) {
            int value = (i % 2 == 0) ? 1 : 0;  //возвращает либо тру либо фолс. тернарный оператор
            massInt[i] = value;

        }

        for (int i = 0; i < massInt.length; i++) {
            System.out.print(" " + massInt[i]);

        }

        extracted(5);
    }

    private static void extracted(int number) {
        switch (number) {
            case 5:
                System.out.println(5);
                break;
            case 3:
                System.out.println(3);
                return;
            default:
                System.out.println(0);//разобрать return и break
        }
        System.out.println("sdjf");
    }
}
