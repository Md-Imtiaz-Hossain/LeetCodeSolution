package O1_easy.day_04;

public class O19_NumberOfArithmeticTriplets_2367 {
    public static void main(String[] args) {
        Solution_2367 solution_2367 = new Solution_2367();
        int[] num = {0, 1, 4, 6, 7, 10};
        int[] num2 = {4, 5, 6, 7, 8, 9};
        System.out.println(solution_2367.arithmeticTriplets(num, 3));
        System.out.println(solution_2367.arithmeticTriplets(num2, 2));
    }
}

class Solution_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int t = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && i < j && j < k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        t += 1;
                    }
                }
            }
        }
        return t;
    }
}

// https://leetcode.com/problems/number-of-arithmetic-triplets/

