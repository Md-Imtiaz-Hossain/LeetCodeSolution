package O1_easy.day_06;

import java.util.Arrays;

public class O26_Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {6, 2, 7, 3};
        System.out.println(Arrays.toString(solution.decode(arr, 4)));
    }
}

class Solution {
    public int[] decode(int[] encoded, int first) {
        System.out.println(Arrays.toString(encoded));
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