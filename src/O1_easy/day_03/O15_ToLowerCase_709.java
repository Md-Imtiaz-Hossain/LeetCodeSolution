package O1_easy.day_03;

import java.util.stream.IntStream;

public class O15_ToLowerCase_709 {
    public static void main(String[] args) {
        Solution_709 solution_709 = new Solution_709();
        String s = "G()(al)";
        System.out.println(solution_709.interpret(s));
    }
}

class Solution_709 {
    public String interpret(String command) {
        return command.toLowerCase();
    }
}

// https://leetcode.com/problems/to-lower-case/

