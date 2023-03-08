package week05;

import java.util.Arrays;

public class ArrayOfDigits {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(arrayOfDigit(490)));
        System.out.println(Arrays.toString(secondWay(490)));


    }

    public static String[] arrayOfDigit(Integer number) {
        return String.valueOf(number).split("");  //  O(1)-->time complexity

    }

    public static int[] secondWay(int number) {
        int length=Integer.toString(number).length();
        int[] arr=new int[length];
        while (number != 0) {                    //I don't know how many digits there are
            for (int i = 0; i <length ; i++) {  //  O(n)--> time complexity
                arr[length-(i+1)]=number%10;
                number=number/10;
            }

        }
        return arr;

    }
}





