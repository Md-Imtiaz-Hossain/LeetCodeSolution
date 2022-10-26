package O1_easy.day_03;

public class O13_RemoveDuplicateFromsortedArray_26 {
    public static void main(String[] args) {
        Solution_26 solution_26 = new Solution_26();
        int[] arr = {1, 1, 2};
        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(solution_26.removeDuplicates(arr));
        System.out.println(solution_26.removeDuplicates(arr2));
    }
}

class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }

        temp[j++] = nums[nums.length - 1];

        // Changing original array
        for (int i = 0; i < j; i++) {
            nums[i] = temp[i];
        }
        return j;
    }
}

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

