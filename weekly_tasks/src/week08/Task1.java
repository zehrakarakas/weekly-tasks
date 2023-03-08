package week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Task1 {
    public static void main(String[] args) {
        int[] nums = {2, 1,0,8,0,7,9,77,0};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
       // Arrays.sort(nums);
        int k = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            } else {
                j++; // there are j times 0;
            }
        }


            for (int p = 0; p < j; p++) {
                nums[nums.length-p-1] = 0;

            }

            System.out.println(Arrays.toString(nums));

        }


    }







       /*


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                list1.add(0);
            } else {
                list2.add(nums[i]);

            }

        }
        Collections.sort(list2);
        list2.addAll(list1);
        System.out.println(list2);


    }


        */
