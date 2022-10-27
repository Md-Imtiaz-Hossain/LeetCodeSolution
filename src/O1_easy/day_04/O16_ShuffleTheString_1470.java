package O1_easy.day_04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class O16_ShuffleTheString_1470 {
    public static void main(String[] args) {
        Solution_1470 solution_1470 = new Solution_1470();
        int[] arr = {2, 5, 1, 3, 4, 7};
        int[] arr2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] arr3 = {1, 1, 2, 2};
        System.out.println(Arrays.toString(solution_1470.shuffle(arr, 3)));
        System.out.println(Arrays.toString(solution_1470.shuffle(arr2, 4)));
        System.out.println(Arrays.toString(solution_1470.shuffle(arr3, 2)));
    }
}

class Solution_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] arrR = new int[nums.length];
        int t = 0;
        for (int k = 0; k < nums.length; k += 2) {
            arrR[k] = nums[t];
            t++;
        }
        int t2 = n;
        for (int l = 1; l < nums.length; l += 2) {
            arrR[l] = nums[t2];
            t2++;
        }
        return arrR;
    }
}

// https://leetcode.com/problems/shuffle-the-array/submissions/


//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[2 * n];
//        for (int i = 0; i < n; ++i) {
//            ans[2 * i] = nums[i];
//            ans[2 * i + 1] = nums[i + n];
//        }
//        return ans;
//    }
//}
//
//
//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[2 * n];
//        for (int i = 0; i < 2 * n; ++i) {
//            ans[i] = nums[i / 2 + i % 2 * n];
//        }
//        return ans;
//    }
//}
//
//
//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        return IntStream.range(0, 2 * n).map(i -> nums[i / 2 + i % 2 * n]).toArray();
//    }
//}