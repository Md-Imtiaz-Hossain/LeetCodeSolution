package O1_easy.day_01;

import java.util.Arrays;

public class O3_RunningSum1dArray_1480 {
    public static void main(String[] args) {
        Solution_1480 solution_1480 = new Solution_1480();
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(solution_1480.runningSum(nums)));
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(solution_1480.runningSum(nums2)));
    }
}
class Solution_1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i=0; i < nums.length; i++){
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }
}

/**
 * {1, 2, 3, 4}
 *
 * Iteration: 1
 * sum = sum + num[i]  | sum = 0 + 1 = 1
 * result[i] = sum     | result[0] = 1
 *
 * Iteration: 2
 * sum = 1 + 2 = 3 , result[1] = 3
 *
 * Iteration: 3
 * sum = 3 + 3 = 6  , result[2] = 6
 *
 * Iteration: 4
 * sum = 3 + 6 = 10 , result[3] = 10
 */

// https://leetcode.com/problems/running-sum-of-1d-array/