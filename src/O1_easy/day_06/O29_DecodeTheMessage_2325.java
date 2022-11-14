package O1_easy.day_06;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class O29_DecodeTheMessage_2325 {
    public static void main(String[] args) {
        Solution_2325 solution_2325 = new Solution_2325();
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
        System.out.println(solution_2325.decodeMessage(key, message));
    }
}

class Solution_2325 {
    public String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();//Using String Builder to append the string
        key = key.replaceAll(" ", "");
        //Removing the spaces
        HashMap<Character, Character> letters = new HashMap<>();
        //Mapping the key into a hashmap.
        char original = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!letters.containsKey(key.charAt(i))) {
                letters.put(key.charAt(i), original++);
            }
        }
        //After the first pass all the letters of the key will be mapped with their respective original letters.
        for (int i = 0; i < message.length(); i++) {
            if (letters.containsKey(message.charAt(i))) {
                //Now replacing the letters of the message with appropriate letter according to the key
                ans.append(letters.get(message.charAt(i)));
            } else {
                ans.append(message.charAt(i));
                //This is for characters other than the letters in the key example a space " "
                //They will not be replaced by any letters hence original letter is appended into the StringBuilder
            }
        }
        return ans.toString();
    }
}

// https://leetcode.com/problems/decode-the-message/

