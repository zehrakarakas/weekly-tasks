package week03.src.main.java;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(fistNonRepeatingVowel("google "));

    }

    public static int fistNonRepeatingVowel(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int vowelCount = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1)
                    return i;
            }
        }
        return -1;


    }
}
