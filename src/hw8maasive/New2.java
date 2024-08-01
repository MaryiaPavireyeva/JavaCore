package hw8maasive;
public class New2 {
    public static void main(String[] args) {
        int mass4[][] = new int[9][9];
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


        int mass5[][] = new int[5][5];
        for (int a = 0; a < mass5.length; a++){
            for (int b = 0; b < mass5[a].length; b++){
                mass5[a][b] = 0;
                mass5[2][2] = 1;
                if (a == 0 || a == 4) {
                    mass5[a][b] = 1;
                }
                if (a == 1 && b != 0 && b != 4)
                {
                    mass5[a][b]  = 1;
                }
                if (a == 3 && b != 0 && b != 4){
                    mass5[a][b]  = 1;
                }
            }
        }
    }
}
