package Massive;

public class DoubleMass {

    public static final int MASS_ROW_SIZE = 4;
    public static final int MASS_COL_SIZE = 4;

    public static void main(String[] args) {
        int [][] mass = new int[MASS_ROW_SIZE][MASS_COL_SIZE];
        initialize(mass);
        print(mass);
//        int [][] massTwo = new int[4][4];
//        initialize(massTwo);
//        print(massTwo);
    }

    private static void print(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {  //просто распечатываем все элементы
        for (int valueCell : mass[i]) {
            System.out.print(" " + valueCell);
        }
            System.out.println();

        }
    }

    private static void initialize(int[][] mass) {
        for (int rowIndex = 0; rowIndex < mass.length; rowIndex++) {   //заполняем массив
            for (int colIndex = 0; colIndex < mass[rowIndex].length; colIndex++) {
                if (colIndex == rowIndex) {
                    mass[rowIndex][colIndex] = 1;
                    break;
                }
//                mass[rowIndex][colIndex] = rowIndex * mass[rowIndex].length + colIndex; //что значит эта строка

            }
        }
    }
}
