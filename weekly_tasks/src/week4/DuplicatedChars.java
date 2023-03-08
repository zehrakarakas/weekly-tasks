package week4;

public class DuplicatedChars {
    public static void main(String[] args) {

        String str = "abcde";
        String str2 = "aabbcde";
        System.out.println(duplicatedChars("abcdeeeekkkpppmmm111"));
    }public static int duplicatedChars(String str) {
        String result = "";
        str=str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
             if(str.charAt(i)==str.charAt(j)){
                 count++;
             }
            }
            if (count > 1)
                if (!result.contains("" + str.charAt(i))) {
                    result += "" + str.charAt(i);
                }
            }

        return result.length();

    }

}






