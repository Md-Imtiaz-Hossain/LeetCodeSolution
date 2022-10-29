package O1_easy.day_06;

import java.util.Arrays;

public class O27_Test {
    public static void main(String[] args) {
        Solution_ s = new Solution_();
        int[] a = {4, 3, 2, 1};
        int[] digits = {9};
        System.out.println(Arrays.toString(s.plusOne(a)));
        System.out.println(Arrays.toString(s.plusOne(digits)));
    }
}

class Solution_ {
    public int[] plusOne(int[] digits) {

        String s = "";
        for (int i = 0; i < digits.length; i++) {
            s += digits[i];
        }

        Integer total = 1 + Integer.parseInt(s);

        String ss = String.valueOf(total);

        char[] c = ss.toCharArray();
        int[] result = new int[c.length];
        int i = 0;
        for (char d : c) {
            result[i] = Integer.parseInt(Character.toString(d));
            i++;
        }
        return result;
    }
}