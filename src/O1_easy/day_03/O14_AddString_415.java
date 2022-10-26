package O1_easy.day_03;

import java.math.BigInteger;

public class O14_AddString_415 {
    public static void main(String[] args) {
        Solution_415 solution_415 = new Solution_415();
        String s = "654615";
        String s2 = "654615";
        System.out.println(solution_415.addStrings(s, s2));
    }
}

class Solution_415 {
    public String addStrings(String num1, String num2) {
        BigInteger bigInteger = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);
        return String.valueOf(bigInteger2.add(bigInteger));
    }
}

// https://leetcode.com/problems/add-strings/submissions/

