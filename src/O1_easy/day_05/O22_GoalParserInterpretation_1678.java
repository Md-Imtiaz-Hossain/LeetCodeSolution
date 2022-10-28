package O1_easy.day_05;

public class O22_GoalParserInterpretation_1678{
    public static void main(String[] args) {
        Solution_1678 solution_1678 = new Solution_1678();
        String j = "G()(al)", s2 = "G()()()()(al)", s3 = "(al)G(al)()()G";
        System.out.println(solution_1678.interpret(j));
        System.out.println(solution_1678.interpret(s2));
        System.out.println(solution_1678.interpret(s3));
    }
}

class Solution_1678 {
    public String interpret(String input) {
        input = input.replaceAll("\\(\\)","o");
        input = input.replaceAll("\\(al\\)","al");
        return input;
    }
}

// https://leetcode.com/problems/goal-parser-interpretation/