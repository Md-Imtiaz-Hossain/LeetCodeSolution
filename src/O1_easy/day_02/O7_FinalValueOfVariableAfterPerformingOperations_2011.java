package O1_easy.day_02;

public class O7_FinalValueOfVariableAfterPerformingOperations_2011 {
    public static void main(String[] args) {
        Solution_2011 solution_2011 = new Solution_2011();
        String[] arr = {"--X", "X++", "X++"};
        String[] arr2 = {"X++", "++X", "--X", "X--"};
        String[] arr3 = {"++X", "++X", "X++"};
        System.out.println(solution_2011.finalValueAfterOperations(arr));
        System.out.println(solution_2011.finalValueAfterOperations(arr2));
        System.out.println(solution_2011.finalValueAfterOperations(arr3));

    }
}

class Solution_2011 {
    public int finalValueAfterOperations(String[] operations) {

        int result = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X")) {
                result = 1 + result;
            } else if (operations[i].equals("--X")) {
                result = result - 1;
            } else if (operations[i].equals("X++")) {
                result = result + 1;
            } else if (operations[i].equals("X--")) {
                result = result - 1;
            }
        }
        return result;
    }
}

// https://leetcode.com/problems/build-array-from-permutation/