package week4.mentorSolution;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars2 {
    public static void main(String[] args) {
        /*
        Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

         */

    }
    public static int getNumber2(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        map.entrySet().removeIf(e -> e.getValue() == 1);
        return map.size();
    }

}
