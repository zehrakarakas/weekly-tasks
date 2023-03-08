package week08;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        System.out.println(removeDuplicates(nums1));
    }

    public static int removeDuplicates(int[] nums) {
       Arrays.sort(nums);

        int p = 1;

        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i] != nums[i+1]) {

                nums[p++] = nums[i+1];

            }
        }

        return p;
    }
}



