package unit2.studios.studio2;

import java.util.ArrayList;
import java.util.HashMap;

public class Text {

    public static HashMap<Character, Integer> countCharacters(String quote) {
        HashMap<Character, Integer> totalCounts = new HashMap<>();
        char[] charactersInString = quote.toCharArray();
        for (char character : charactersInString) {
            if (!totalCounts.containsKey(character)) {
                totalCounts.put(character, 1);
            } else {
                int currentValue = totalCounts.get(character);
                totalCounts.put(character, currentValue + 1);
            }
        }            return totalCounts;

    }
}
