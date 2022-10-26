package O1_easy.day_03;

public class O11_MaxNumberOfWordInSentence_2114 {
    public static void main(String[] args) {
        Solution_2114 solution_2114 = new Solution_2114();
        String[] arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] arr2 = {"please wait", "continue to fight", "continue to win"};
        System.out.println((solution_2114.mostWordsFound(arr)));
        System.out.println((solution_2114.mostWordsFound(arr2)));
    }
}

class Solution_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int c = most(sentences[i]);
            if (c > max) {
                max = c;
            }
        }
        return max;
    }

    public int most(String s) {
        int m = 0;
        String[] strings = s.split(" ");
        m = strings.length;
        return m;
    }
}

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

