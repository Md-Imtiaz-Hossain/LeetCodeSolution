package O1_easy.day_02;

public class O8_NumberOfGoodPairs_1512 {
    public static void main(String[] args) {
        Solution_1470 solution_1470 = new Solution_1470();
        int[] arr = {1, 2, 3, 1, 1, 3};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {1, 2, 3};
        System.out.println((solution_1470.numIdenticalPairs(arr)));
        System.out.println((solution_1470.numIdenticalPairs(arr2)));
        System.out.println((solution_1470.numIdenticalPairs(arr3)));
    }
}

class Solution_1470 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}

// https://leetcode.com/problems/number-of-good-pairs/