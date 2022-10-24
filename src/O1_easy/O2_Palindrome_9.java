package O1_easy;
public class O2_Palindrome_9 {
    public static void main(String args[]){
        Solution_9 solution = new Solution_9();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(123));
    }
}
class Solution_9 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);
        String s1 = String.valueOf(sb.reverse());
        if (s.equals(s1)){
            return true;
        }else {
            return false;
        }
    }
}

// https://leetcode.com/problems/palindrome-number/