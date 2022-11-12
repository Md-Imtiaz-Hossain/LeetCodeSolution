package O1_easy.day_20;

import java.util.Arrays;

public class O_ReverseWordInString_557 {
    public static void main(String[] args) {
        Solution_557 solution_557 = new Solution_557();
        String s = "Let's take LeetCode contest", s2 = "God Ding";
        System.out.println(solution_557.reverseWords(s));
        System.out.println(solution_557.reverseWords(s2));
    }
}


class Solution_557 {
    public String reverseWords(String str) {
        String[] words = str.split(" ");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }
}

// https://leetcode.com/problems/reverse-words-in-a-string-iii/

/**
 * The trim() method in Java String is a built-in function that eliminates leading and trailing spaces.
 * The Unicode value of space character is '\u0020'. The trim() method in java checks this Unicode value
 * before and after the string, if it exists then removes the spaces and returns the omitted string
 */


//
//class Solution {
//// Approach:
//// Split the string into String array 'words'.
//// Then use a StringBuilder to reverse each words within the 'words' array.
//// Note: This approach uses more time and memory than the two pointers, due to the use of StringBuilder.
//    public String reverseWords(String s) {
//        // Split the String 's' using regex " ".
//        String[] words = s.split(" ");
//
//        // Reverse each word in the 'words' array.
//        for (int i = 0; i < words.length; i++) {
//            words[i] = new StringBuilder(words[i]).reverse().toString();
//        }
//
//        // Build a new String using the " " delimiter and return result.
//        return String.join(" ", words);
//    }
//}
//
//
//class Solution {
//    public String reverseWords(String s) {
//        int l = 0, r = 0, n = s.length();
//        char[] c = s.toCharArray();
//        for (int i = 0; i < n; i++) {
//            // looking for the space index
//            if (c[i] == ' ' || i == n - 1) {
//                // r is the index before the space
//                // if s[i] is space, then we want to reverse s[l : i - 1]
//                // if s[i] is the last character, then we want to reverse s[l : i]
//                r = i == n - 1 ? i : i - 1;
//                // swap the character
//                // e.g. s = `Let's` where l is 0 and r is 4
//                // Let's -> set'L -> s'teL
//                while (l < r) {
//                    char tmp = c[l];
//                    c[l] = c[r];
//                    c[r] = tmp;
//                    l++;
//                    r--;
//                }
//                // update left pointer which is i + 1
//                // i.e. the first index of the next word if applicable
//                l = i + 1;
//            }
//        }
//        return new String(c);
//    }
//}
//
//
//class Solution {
//    // Approach:
//    // Using two pointers, 'start' and 'end', each time 'end' reaches a space, we reverse the words before.
//    // To reverse, we convert the String 's' to a char array, then write a method to reverse the char in the array.
//    public String reverseWords(String s) {
//        // Convert s into char array.
//        char[] chars = s.toCharArray();
//
//        int start = 0;
//        int end;
//        for (end = 0; end <= chars.length; end++) {
//            // When 'end' reaches a space character ' ', reverse the words from 'start' to 'end' - 1 index in 'chars'.
//            if (end == chars.length || chars[end] == ' ') {
//                reverse(chars, start, end - 1);
//                // reset the start for the next word.
//                start = end + 1;
//            }
//        }
//        return new String(chars);
//    }
//    // A private method to reverse the char in the array using the 'start' and 'end' pointer.
//    private void reverse(char[] c, int start, int end) {
//        while (start < end) {
//            char tmp = c[end];
//            c[end] = c[start];
//            c[start] = tmp;
//            start++;
//            end--;
//        }
//    }
//}
