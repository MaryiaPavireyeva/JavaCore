package hw_warOrPeace6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExSearch implements ISearchEngine {

    public long search(String text, String word) {
        int count = 0;
            Pattern p = Pattern.compile(word);
            Matcher matcher = p.matcher(text);
            while (matcher.find()) {
//                count = text.substring(matcher.start(), matcher.end());
            }
        return count;
    }

    public static void main(String[] args) {
        regExSearch reg = new regExSearch();
        System.out.println(reg.search("Возвращает индекс первого символа встретившейся строки первого символа встретившейся строки.", "символа"));


    }
}


