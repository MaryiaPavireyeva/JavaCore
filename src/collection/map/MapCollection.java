package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);


        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Водитель", "Driver");
        String foundValue = dictionary.get("Водитель");

        System.out.println(foundValue);

        Map<String, String> dictionaryEnToRu = new HashMap<>();
        dictionaryEnToRu.put("Driver", "Водитель");
        dictionaryEnToRu.put("Driver", "Шофер");
        dictionaryEnToRu.put("Driver", "Кучер");
        dictionaryEnToRu.put("Driver", "Вагоноважатый");

        String foundData = dictionaryEnToRu.get("Driver");

        System.out.println(foundData);

        Map<String, List<String>> dictionaryEnToRuMulti = new HashMap<>();

        List<String> driver = new ArrayList<>();
        driver.add("Водитель");
        driver.add("Шофер");
        driver.add("Кучер");
        driver.add("Вагоноважатый");
        dictionaryEnToRuMulti.put("Driver", driver);
        List<String> multi = dictionaryEnToRuMulti.get("Driver");
        System.out.println(multi);
    }
}
