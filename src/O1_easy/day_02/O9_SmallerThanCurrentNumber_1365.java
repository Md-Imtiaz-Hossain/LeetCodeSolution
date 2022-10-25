package O1_easy.day_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class O9_SmallerThanCurrentNumber_1365 {
    public static void main(String[] args) {
        Solution_1365 solution_1365 = new Solution_1365();
        int[] arr = {8, 1, 2, 2, 3};
        int[] arr2 = {6, 5, 4, 8};
        int[] arr3 = {7, 7, 7, 7};
        System.out.println((Arrays.toString(solution_1365.smallerNumbersThanCurrent(arr))));
        System.out.println((Arrays.toString(solution_1365.smallerNumbersThanCurrent(arr2))));
        System.out.println((Arrays.toString(solution_1365.smallerNumbersThanCurrent(arr3))));
    }
}

class Solution_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }
}

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/

/**
 * Both i and j loop start from 0.
 * so that every element is compare to every element.
 */

