package O1_easy;


public class O4_StringEquivalent_1662 {
    public static void main(String[] args) {
        Solution_1662 solution_1662 = new Solution_1662();
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        System.out.println(solution_1662.arrayStringsAreEqual(word1, word2));
    }
}
class Solution_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String r1 = "";
        for (int i = 0; i<word1.length ; i++){
            r1 += word1[i];
        }
        System.out.println(r1);
        String r2 = "";
        for (int i = 0; i<word2.length ; i++){
            r2 += word2[i];
        }
        System.out.println(r2);

        if (r1.equals(r2)){
            return true;
        }else {
            return false;
        }
    }
}

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
