package hw_warOrPeace6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExSearch implements ISearchEngine {

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте №4.2 дз
     *
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return кол-во повторений с учетом регистра
     */
    public long search(String text, String word) {
        int count = 0;
        Pattern p = Pattern.compile(word);
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            text.substring(matcher.start(), matcher.end());
            count++;
        }
        return count;
    }

    String content;

    public regExSearch(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        String path = "src/hw_warOrPeace6/Война и мир_книга.txt";
/**
 * читаю файл в String и вывожу сколько раз встречаются слова "война", "и" (как союз), "мир".
 */
        try {
            String content = Files.readString(Path.of(path));
            regExSearch s = new regExSearch(content);
            long war = s.search(content, "война");
            long and = s.search(content, "и");
            long world = s.search(content, "мир");
            System.out.println("война: " + war + " и: " + and + " мир: " + world);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


