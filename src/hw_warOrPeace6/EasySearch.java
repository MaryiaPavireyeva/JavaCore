package hw_warOrPeace6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EasySearch implements ISearchEngine {

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте №4.1 дз
     *
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return кол-во повторений с учетом регистра
     */
    @Override
    public long search(String text, String word) {
        int count = 0;
        int first = 0;
        for (int i = 0; i < text.length(); i++) {
            if (count == 0) {
                first = text.indexOf(word);
                if (first >= 0) {
                    int end = first + word.length();
                    String founded = text.substring(first, end);
                    if (founded.equals(word)) {
                        count++;
                    }
                }
            } else {
                first = text.indexOf(word, first + word.length());
                if (first >= 0) {
                    int end = first + word.length();
                    String founded = text.substring(first, end);
                    if (founded.equals(word)) {
                        count++;
                    }
                }
                if (first == -1) {
                    break;
                }
            }
        }
        return count;
    }

    String content;

    public EasySearch(String content) {
        this.content = content;
    }

    public static void main(String[] args) throws IOException {

        String path = "src/hw_warOrPeace6/Война и мир_книга.txt";
/**
 * читаю файл в String и вывожу сколько раз встречаются слова "война", "и" (как союз), "мир". №5.1 дз
 */
        try {
            String content = Files.readString(Path.of(path));
            EasySearch s = new EasySearch(content);
            long war = s.search(content, "война");
            long and = s.search(content, "и");
            long world = s.search(content, "мир");
            System.out.println("война: " + war + " и: " + and + " мир: " + world);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}