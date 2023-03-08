package week4.ThiefWithStream;

import week4.Fox;

public class ThiefFox {
    public static void main(String[] args) {
        FoxData.getFoxes().stream()
                    .filter(p -> p.coatColor.equals("BLACK"))
                    .filter(p -> p.WearsCoat == true)
                    .filter(p -> p.HasATorch == true)
                    .filter(p -> p.bagCount == 3)
                    .map(Fox::getName)
                    .forEach(System.out::println);
    }
    }


