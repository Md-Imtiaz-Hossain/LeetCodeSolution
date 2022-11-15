package O1_easy.day_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O31_CreateTargetArrayInGivenArray_1389 {
    public static void main(String[] args) {
        Solution_1389 solution_1389 = new Solution_1389();
        int[] nums = {0, 1, 2, 3, 4}, index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(solution_1389.createTargetArray(nums, index)));
    }
}

class Solution_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}

// https://leetcode.com/problems/create-target-array-in-the-given-order/

