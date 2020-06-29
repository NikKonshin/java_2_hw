package homework3.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> setOfWords = new ArrayList<>();
        setOfWords.addAll(Arrays.asList("река", "вода", "дом", "семья", "компьютер", "лес", "погода", "река", "лес", "вода", "пол", "человек", "река", "вода", "лес"));

        Map<String, Integer> setOfWordsMap = new HashMap<>();
        for (int i = 0; i < setOfWords.size(); i++) {
            String word = setOfWords.get(i);
            Integer value = setOfWordsMap.get(word);
            // тут решил для себя воспользоваться старой схемой, не через .getOrDefault();
            if (value == null) {
                setOfWordsMap.put(word, 1);
            } else {
                setOfWordsMap.put(word, value + 1);
            }
        }

        System.out.print("Уникальные: ");
        setOfWordsMap.forEach((k, v) -> {
            if (v == 1) {
                System.out.print(k + "; ");
            }
        });
        System.out.println();

        System.out.println(setOfWordsMap);
    }
}
