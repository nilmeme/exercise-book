package me.nilme.leecode;

/**
 * Created by nilme on 2019/12/22.
 */
public class Promblem1 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum(nums, target);

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }

}
