package O1_easy.day_05;

public class O23_Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "RLRRLLRLRL";
        System.out.println(solution.balancedStringSplit(s1));

    }
}


class Solution {
    public int balancedStringSplit(String s) {

        int n = 0;
        char c = 'R', c2 = 'L';

//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == c || s.charAt(i) == c2) {
//                long a = s.chars().filter(num -> num == 'R').count();
//                long b = s.chars().filter(num -> num == 'L').count();
//                if (a == b) {
//                    n++;
//                    System.out.println(s.charAt(i));
//                }
//                //System.out.println(s.charAt(i));
//            }
//
//        }


        System.out.println("All substring of abbc are:");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if ((s.charAt(i) == 'R')){
                    System.out.println(s.substring(i,j));
                }

            }
        }

        return n;

    }
}

// https://leetcode.com/problems/split-a-string-in-balanced-strings/