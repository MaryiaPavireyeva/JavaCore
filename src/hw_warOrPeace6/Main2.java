package hw_warOrPeace6;

public class Main2 implements ISearchEngine {

    private static long search(String text, String word) {
        text.toUpperCase();
        String[] mass = text.split(" ");
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i].equals(word)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(search("dshkf Sajsda Sajsda sdfjhsd ksdfk Sajsda SDA", "Sajsda"));


    }
}
