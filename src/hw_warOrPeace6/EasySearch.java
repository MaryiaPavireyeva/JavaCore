package hw_warOrPeace6;

public class EasySearch implements ISearchEngine {

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте
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
                    System.out.println(founded);
                    if (founded.equals(word)) {
                        count++;
                    }
                }
            } else {
                first = text.indexOf(word, first + word.length());
                if (first >= 0) {
                    int end = first + word.length();
                    String founded = text.substring(first, end);
                    System.out.println(founded);
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


    public static void main(String[] args) {
        EasySearch ss = new EasySearch();
        System.out.println(ss.search("символа символа символа символа символа Символа ", "Символа"));
    }
}