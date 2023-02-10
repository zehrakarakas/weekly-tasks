public class Task1 {
   public String beast;
   public String dish;


   public static boolean feast(String beast,String dish){
       return (beast.charAt(0) == dish.charAt(0)) && (beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1));
   }
}
