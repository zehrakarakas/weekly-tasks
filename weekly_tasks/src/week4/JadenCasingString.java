package week4;

public class JadenCasingString {
    public static void main(String[] args) {
        String str = "How can mirrors be real if our eyes aren't real";
        String str1="";
        System.out.println(capitalizingEveryWorld(str));
        System.out.println(capitalizingEveryWorld(str1));
    }

    public static String capitalizingEveryWorld(String str) {
        String[] str1 = str.split(" ");
        String result = "";


      try{
          for (String each : str1) {
              result += each.substring(0, 1).toUpperCase() + each.substring(1) + " ";
          }
       }catch (StringIndexOutOfBoundsException e){
          return null;

      }
      return result;
    }
}