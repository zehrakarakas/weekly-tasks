package week4.ThiefWithStream;

import week4.Fox;

import java.util.Arrays;
import java.util.List;

public class FoxData {
    public static List<Fox> getFoxes() {

      return  Arrays.asList(
              new Fox("fox1", "BLACK", 0, true, true),
              new Fox("fox2", "BLACK", 2, true, true),
              new Fox("fox3", "BLACK", 3, true, true),
              new Fox("fox4", "GRAY", 3, true, false)
      );
    }
}