package O1_easy.day_04;

public class O20_SmallestIndexWithEqualValue_2057 {
    public static void main(String[] args) {

        Solution_2057 solution_2057 = new Solution_2057();
        int[] arr = {0, 1, 2};
        int[] arr2 = {4, 3, 2, 1};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(solution_2057.smallestEqual(arr));
        System.out.println(solution_2057.smallestEqual(arr2));
        System.out.println(solution_2057.smallestEqual(arr3));
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