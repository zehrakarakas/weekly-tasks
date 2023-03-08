package week04.Thief2;

import week04.Fox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoxData2 {
    public static void main(String[] args) {
        Fox fox1 = new Fox("fox1","BLACK", 0, true, true);
        Fox fox2 = new Fox("fox2", "BLACK", 2, true, true);
        Fox fox3 = new Fox("fox3", "BLACK", 3, true, true);
        Fox fox4 = new Fox("fox4", "GRAY", 3, true, false);

        List<Fox> foxes = new ArrayList<>();
        foxes.addAll(Arrays.asList(fox1,fox2,fox3,fox4));

        for (Fox eachFox : foxes) {
            ThiefFox2.suspect(eachFox);
        }

       }
    }

