package O1_easy.day_20;

public class O_Test_1967 {
    public static void main(String[] args) {
        Solution_1967 solution_1967 = new Solution_1967();
        String[] arr = {"a","abc","bc","d"}; String word = "abc";
        System.out.println(solution_1967.numOfStrings(arr, word));
    }
}


class Solution_1967 {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String s: patterns){
            if(word.contains(s)) count++;
        }
        return count;
    }
}

// https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/


//class Solution {
//    public int numOfStrings(String[] words, String s) {
//        int count = 0;
//        for (String str : words) {
//            if (match(str, s)) count++;
//        }
//        return count;
//    }
//
//    private static boolean match(String str, String s) {
//        for (int i = 0; i < s.length(); i++){
//            String st = s.substring(i);
//            if (st.startsWith(str)) return true;
//        }
//        return false;
//    }
//}
//
//
//class Solution {
//    public int numOfStrings(String[] patterns, String word) {
//        int count=0;
//        for(String s:patterns){
//            if(word.indexOf(s)!=-1) count++;
//        }
//        return count;
//    }
//}
//
//class Solution {
//    public int numOfStrings(String[] patterns, String word) {
//        List<String> list = subStrings(word);
//        int count = 0;
//        for(String str : patterns){
//            if(list.contains(str)){
//                count++;
//            }
//        }
//        return count;
//    }
//    private static List<String> subStrings(String str){
//        List<String> list = new ArrayList<String>();
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = i + 1; j <= str.length(); j++) {
//                list.add(str.substring(i, j));
//            }
//        }
//        return list;
//    }
//}