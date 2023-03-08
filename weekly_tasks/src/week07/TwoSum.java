package week07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4,7}, 7)));
    }
    public static int[] twoSum(int[] nums, int target) {


        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{comp, nums[i]};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    }


      /*  Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

       */

