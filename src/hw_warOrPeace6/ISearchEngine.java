package hw_warOrPeace6;


public interface ISearchEngine {

    /**
     * метод возвращает информацию о количестве раз которое встречается слово в тексте задание №3.1
     *
     * @param text текст в котором ищем
     * @param word что ищем в тексте
     * @return возвращает информацию о количестве раз которое встречается слово в тексте
     */
    long search(String text, String word);
}
