package O1_easy.day_07;

public class O35_SumOfAllOldLengthSubArray_1588 {
    public static void main(String[] args) {
        Solution_1588 solution_1588 = new Solution_1588();
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(solution_1588.sumOddLengthSubarrays(arr));
    }
}


class Solution_1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += (arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2));
        return sum;
    }
}

// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
