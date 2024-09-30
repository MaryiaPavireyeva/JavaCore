package hw_warOrPeace6;

import java.io.*;
import java.util.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String path = "src/hw_warOrPeace6/Война и мир_книга.txt";

        allWordsInText(path);
        topWords(path);

    }

    /**
     * метод, который считает все слова в тексте и помещает их в сэт пункт №2 дз
     *
     * @param path путь до файла
     * @throws IOException
     */
    private static void allWordsInText(String path) throws IOException {
        Set<String> allWords = new HashSet<>();
        File file = new File(path);

        BufferedReader fr = new BufferedReader(new FileReader(file));
        String line = fr.readLine();
//читаем файл, разделяем на слова, помещаем в массив и все получившиеся массивы добавляем в Сэт
        while (line != null) {
            String[] mass = line.split("[-|\"|.|-| |!|\s|\\n]+");
            allWords.addAll(Arrays.asList(mass));
            line = fr.readLine();
        }
        fr.close();

        System.out.println("кол-во слов в Сэте: " + allWords.size());
    }


    /**
     * метод, который ищет кол-во повторений слов в Мапе и сортирует по самомым топовым повторениям пункт №2,2 дз
     *
     * @param path путь до файла
     * @throws IOException
     */
    private static void topWords(String path) throws IOException {
        Map<String, Integer> top = new HashMap<>();
        File file = new File(path);

        BufferedReader fr = new BufferedReader(new FileReader(file));
        String line = fr.readLine();
//читаем файл, разделяем на слова, помещаем в массив и все получившиеся массивы добавляем в Сэт
        while (line != null) {
            String[] mass = line.split("[-|\"|.|-| |!|\s|\\n]+");
            for (String part : mass) {
                Integer count = top.get(part);
                if (count == null) {
                    count = 0;
                }
                count += 1;

                top.put(part, count);
            }
            line = fr.readLine();
        }
        fr.close();
        System.out.println("Top words: " + top);

        System.out.println("-------------");

        List<Map.Entry<String, Integer>> list = new ArrayList<>(top.entrySet());
        System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });
        Collections.reverse(list);

        System.out.println("--------------SORTED-------------");
        System.out.println("--------------SORTED-------------");
        System.out.println("--------------SORTED-------------");
        System.out.println("--------------SORTED-------------");
        System.out.println("--------------SORTED-------------");

        ListIterator<Map.Entry<String, Integer>> topOfTheTop = list.listIterator();
        int count = 0;
        while (topOfTheTop.hasNext()) {
            if (count < 3) {
                System.out.println(topOfTheTop.next());
                count++;
            }
        }
    }
}
