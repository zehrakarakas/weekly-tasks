package week01;
public class PalindromeNumber {
    public boolean isPalindrome(int x) {


            StringBuffer sb = new StringBuffer(Integer.toString(x));
            return (sb.toString().compareTo(sb.reverse().toString()) == 0) ? true : false;
        }
    }


   /* public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
}

    */

