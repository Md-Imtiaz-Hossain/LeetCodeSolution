package O1_easy.day_06;

public class O26_SingleNumber_136 {
    public static void main(String[] args) {
        Solution_136 solution_136 = new Solution_136();
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(solution_136.singleNumber(arr));
    }
}

class Solution_136 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}

// https://leetcode.com/problems/single-number/
