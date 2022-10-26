package O1_easy.day_03;

import java.util.Arrays;

public class O12_TwoSum_1 {
    public static void main(String[] args) {
        Solution_1 solution_1 = new Solution_1();
        int[] arr = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 4};
        System.out.println(Arrays.toString(solution_1.twoSum(arr, 9)));
        System.out.println(Arrays.toString(solution_1.twoSum(arr2, 6)));
    }
}

class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/two-sum/submissions/

