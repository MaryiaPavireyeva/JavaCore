package hw8maasive;
public class Main {

    public static void main(String[] args) {
        System.out.println("задача 20");
        int mass[] = new int[10]; //задача 20
        int maxMark = mass[0];
        int place = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 10 + 1);
            if (maxMark < mass[i]) {
                maxMark = mass[i];
                place = i;
            }
        }
        System.out.println(place);

        System.out.println("задача 21");
        int mass2[] = new int[10]; //задача 21. Не сделала часть с несколькими мин и макс значениями
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = (int) (Math.random() * 10 + 1);}
        int placeI = 0;
        int placeJ = 0;
        int sum = 0;
        int max = mass2[0];
        int min = mass2[0];
        for (int j = 0; j < mass2.length; j++) {

            if (max < mass2[j]) {
                max = mass2[j];
                placeI = j;
            }
            if (min > mass2[j]) {
                min = mass2[j];
                placeJ = j;
            }
        }

        if (placeI > placeJ) {
            for (int m = placeJ + 1; m < placeI; m++) {
                sum += mass2[m];
            }
            System.out.println(" сумма " + sum);
        }

        if (placeI < placeJ) {
            for (int m = placeI + 1; m < placeJ ; m++) {
                sum += mass2[m];
            }
            System.out.println(" сумма " + sum);
        }
//            System.out.println(placeI + " is place in mass for MAX " + max + " " + placeJ + " is place in mass for MIN  " + min);


        System.out.println("задача 22");
        int mass3[] = new int[10]; //задача 22
        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = (int) (Math.random() * 10 + 1);
            System.out.print(mass3[i] + " ");
        }
        System.out.println(" ");
        System.out.println("в обратном порядке");
        for (int a = 0; a < mass3.length / 2; a++) {
            int b = mass3[mass3.length - 1 - a];
            mass3[mass3.length - 1- a] = mass3[a];
            mass3[a] = b;
        }

        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i] + " ");
        }

        System.out.println(" ");
        System.out.println("задача 24");

        int mass4[][] = new int[8][8]; //с четным вариантом не прокатит
        for (int a = 0; a < mass4.length / 2 + 1; a++) {
            for (int b = 0; b < mass4[a].length; b++) {
                if ((b < a || (b >= mass4[a].length - a)))
                    mass4[a][b] = 0;
                else
                    mass4[a][b] = 1;
            }
        }
        for (int a = mass4.length - 1; a >= mass4.length / 2 + 1; a--) {
            for (int b = 0; b < mass4[a].length; b++) {
                if ((b < (mass4[a].length - 1 - a)) || (b > a))
                    mass4[a][b] = 0;
                else
                    mass4[a][b] = 1;
            }

        }

        for (int i = 0; i < mass4.length; i++) {
            for (int valueCell : mass4[i]) {
                System.out.print(" " + valueCell);
            }
            System.out.println(" ");
        }


    }
}


