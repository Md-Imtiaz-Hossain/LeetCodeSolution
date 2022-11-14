package O1_easy.day_06;

import java.util.Arrays;

public class O28_DecodeXORedArray_1720 {
    public static void main(String[] args) {
        Solution_1720 solution_1720 = new Solution_1720();
        int[] arr = {6, 2, 7, 3};
        System.out.println(Arrays.toString(solution_1720.decode(arr, 4)));
    }
}

class Solution_1720 {
    public int[] decode(int[] encoded, int first) {
        int first1 = first;
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = first1 ^ encoded[i];
            first1 = first1 ^ encoded[i];
        }
        return result;
    }
}

// https://leetcode.com/problems/decode-xored-array/
