package collection.map;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<String, List<String>> dictionaryEnToRuMulti = new HashMap<>();

        List<String> driver = new ArrayList<>();
        driver.add("Водитель");
        driver.add("Шофер");
        driver.add("Кучер");
        driver.add("Вагоноважатый");
        dictionaryEnToRuMulti.put("Driver", driver);
        List<String> multi = dictionaryEnToRuMulti.get("Driver");

        Set<String> keys = dictionaryEnToRuMulti.keySet();
        Collection<List<String>> value = dictionaryEnToRuMulti.values();

        Set<Map.Entry<String, List<String>>> entries = dictionaryEnToRuMulti.entrySet();

        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println("key = " + entry.getKey());
            System.out.println("value = " + entry.getValue());
        }

        for (String key : keys) {
            System.out.println("key = " + key);
            System.out.println("value = " + dictionaryEnToRuMulti.get(key));
        }

        System.out.println(multi);
    }
}
