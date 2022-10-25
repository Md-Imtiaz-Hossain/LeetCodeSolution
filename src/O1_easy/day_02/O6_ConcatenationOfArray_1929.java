package O1_easy.day_02;

import java.util.Arrays;

public class O6_ConcatenationOfArray_1929 {
    public static void main(String[] args) {
        Solution_1929 solution_1929 = new Solution_1929();
        int[] arr = {1, 3, 2, 1};
        System.out.println(Arrays.toString(solution_1929.getConcatenation(arr)));
    }
}

class Solution_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] newAnswer = new int[nums.length * 2];
        int givenArrayLength = nums.length;
        for (int i = 0; i < nums.length; i++) {
            newAnswer[i] = nums[i];
            newAnswer[i + givenArrayLength] = nums[i];
        }
        return newAnswer;
    }
}

// https://leetcode.com/problems/concatenation-of-array/

    /**
     * (int i = 0; i < nums.length; i++) --> must be i<nums.length or i<=nums.length-1
     */


