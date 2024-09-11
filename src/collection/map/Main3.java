package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Map<String, List<String>> dictionary = new HashMap<>();

        List<String> driver = new ArrayList<>();
        driver.add("Водитель");

        dictionary.put("Driver", driver);

        driver.add(1, "Шофер");
        dictionary.put("Driver", driver);
        System.out.println(dictionary.get("Driver"));

        job(dictionary);
        System.out.println(dictionary.get("Driver"));
    }

    public static void job(Map<String, List<String>> dictionary) {
        List<String> driver = dictionary.get("Driver");

        driver.add("Кучер");
    }
}
