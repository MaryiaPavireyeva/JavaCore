package generic;

import generic.comparator.StringLengthComparator;

import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {
        String[] name = {
                "Маша Ках",
                "Коля Чфл",
                "Дима РЛл"
        };

        int result = "Mаша".compareTo("Каша");
        Comparator<String> cmp = new StringLengthComparator();
        int result1 = cmp.compare("Mаша", "Каша");
    }
}
