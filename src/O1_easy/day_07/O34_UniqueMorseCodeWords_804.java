package O1_easy.day_07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class O34_UniqueMorseCodeWords_804 {
    public static void main(String[] args) {
        Solution_804 solution_804 = new Solution_804();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(solution_804.uniqueMorseRepresentations(words));
    }
}


class Solution_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mappings = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet();
        StringBuilder code = new StringBuilder();
        for (String s : words) {
            for (int i = 0; i < s.length(); i++) {
                code.append(mappings[s.charAt(i) - 'a']); // -'a' to get array index; Ascii val of a = 97
            }
            set.add(code.toString());
            code.setLength(0); //clearing the stringbuilder
        }
        return set.size();
    }
}

// https://leetcode.com/problems/unique-morse-code-words/
