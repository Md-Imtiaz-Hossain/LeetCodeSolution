package O1_easy.day_07;

public class O32_CountNumberOfPairsWithAbsoluteDifferenceK_2006 {
    public static void main(String[] args) {
        Solution_2006 solution_2006 = new Solution_2006();
        int[] nums = {1, 2, 2, 1};
        int k = 1;
        System.out.println(solution_2006.countKDifference(nums, k));
    }
}

class Solution_2006 {
    public int countKDifference(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[j] - nums[i]) == (-k) || (nums[j] - nums[i]) == (k)) {
                    c++;
                }
            }
        }
        return c;
    }
}

// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/submissions/

