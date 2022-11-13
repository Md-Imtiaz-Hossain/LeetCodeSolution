package O1_easy.day_05;

public class O25_ShuffleString_1528 {
    public static void main(String[] args) {
        Solution_1528 solution_1528 = new Solution_1528();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String s2 = "abc";
        int[] indices2 = {0, 1, 2};
        System.out.println(solution_1528.restoreString(s, indices));
        System.out.println(solution_1528.restoreString(s2, indices2));
    }
}


class Solution_1528 {
    public String restoreString(String s, int[] in) {
        char[] c = new char[in.length];
        for (int i = 0; i < in.length; i++)
            c[in[i]] = s.charAt(i);
        return new String(c);
    }
}
// O(n) - Time and Space

// https://leetcode.com/problems/shuffle-string/

