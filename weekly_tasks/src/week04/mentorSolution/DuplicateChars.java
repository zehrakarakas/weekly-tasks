package week04.mentorSolution;

public class DuplicateChars {
    public static void main(String[] args) {
        /*
        Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

         */
        System.out.println(getNumber("aabbccdd33344455"));
    }
    public static int getNumber(String str) {
        String[] ch = str.toLowerCase().split("");
        String newString = "";
        for (String each : ch) {    //compare each
            int counter = 0;
            for (String result : ch) {
                if (result.equals(each)) {
                    counter++;
                }
            }
            if (counter > 1 && !(newString.contains(each))) {
                newString += each;
            }
        }
        return newString.length();
    }

}

