package O1_easy.day_02;

public class O10_TruncateSentence_1816 {
    public static void main(String[] args) {
        Solution_1816 solution_1365 = new Solution_1816();
        System.out.println(solution_1365.truncateSentence("Hello how are you Contestant", 4));
    }
}

class Solution_1816 {
    public String truncateSentence(String s, int k) {
        String[] na = s.split(" ");
        String newString = "";
        for (int i = 0; i < k; i++) {
            if (i != k - 1) {
                newString += na[i] + " ";
            } else {
                newString += na[i];
            }
        }
        return newString;
    }
}

// https://leetcode.com/problems/truncate-sentence/



