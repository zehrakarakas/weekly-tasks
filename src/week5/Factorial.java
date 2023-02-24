package week5;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial(6));
    }
    public static int findFactorial(int n){
        int result=1;
        if(n>0){
            for (int i = 1; i <=n; i++) {  // O(n)-->time complexity
          result *= i;
            }
        }

        return result;
    }
}
