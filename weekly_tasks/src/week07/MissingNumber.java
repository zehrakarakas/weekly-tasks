package week07;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println((missingNumber2(new int[]{0,1, 2, 4})));

    }
    public static int missingNumber(int[] nums){
        int n=nums.length;
        int[] arr= new int[n+1];
        for (int i = 0; i <=n; i++) {
            arr[i]=i;
        }


    return Arrays.stream(arr).reduce(0,Integer::sum)-Arrays.stream(nums).reduce(0,Integer::sum);

    }


    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2; //The sum of the first n numbers formula
        int sum2 = 0;

        for (int i = 0; i <n; i++) {
            sum2 += nums[i];
        }
        return sum - sum2;

    }
}
