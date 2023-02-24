package week6;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }

    public static boolean isPalindrome(String str) {
     /*   str = str.toLowerCase().replaceAll("[^a-zA-Z0-9\s]", "");
        str=str.replace(" ","");


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                  return false;

                }
        }

        return true;
    }

}

      */

  str=str.toLowerCase();
        String  newStr="";

        for(int i=0;i<=str.length()-1;i++) {
            if(Character.isLetterOrDigit(str.charAt(i))) {
             newStr+=str.charAt(i);
            }
        }

        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)) {
                  return false;

                }
        }

        return true;

    }

}


/*
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.isEmpty()) return true;
        s = s.toLowerCase();

        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                if (l == r) return true;
            }
            while (!Character.isLetterOrDigit(s.charAt(r))) r--;

            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}



 */


/*
Question-2 Valid Palindrome
Write a function that accepts a string and determines whether it is a palindrome, ignoring nonalphanumeric characters and case and returns true if it is palindrome.
(A string is said to be palindrome if it reads the same backward as forward, after converting all
uppercase letters into lowercase letters and removing all non-alphanumeric characters).
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
Constraints:
• 1 <= s.length <= 2 * 105
• s consists only of printable ASCII characters.
Please, test your solution here : https://leetcode.com/problems/valid-palindrome/
You may try two pointer technique for second question to improve your time & space complexity.

 */