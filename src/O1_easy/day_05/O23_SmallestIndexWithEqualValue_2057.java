package O1_easy.day_05;

public class O23_SmallestIndexWithEqualValue_2057 {
    public static void main(String[] args) {
        Solution_2057 solution_2057 = new Solution_2057();
        int[] nums = {4, 3, 2, 1};
        System.out.println(solution_2057.smallestEqual(nums));
    }
}

class Solution_2057 {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}

// https://leetcode.com/problems/smallest-index-with-equal-value/

