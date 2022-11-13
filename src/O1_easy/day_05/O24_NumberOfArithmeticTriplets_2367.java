package O1_easy.day_05;

public class O24_NumberOfArithmeticTriplets_2367 {
    public static void main(String[] args) {
        Solution_2367 solution_2367 = new Solution_2367();
        int[] nums = {0,1,4,6,7,10}; int diff = 3;
        System.out.println(solution_2367.arithmeticTriplets(nums, diff));
    }
}

class Solution_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && i < j && j < k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/number-of-arithmetic-triplets/

