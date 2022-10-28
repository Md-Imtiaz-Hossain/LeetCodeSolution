package O1_easy.day_05;

public class O21_JewelsAndStones_771 {
    public static void main(String[] args) {
        Solution_771 solution_771 = new Solution_771();
        String j = "aA", s = "aAAbbbb";
        String j2 = "z", s2 = "ZZ";
        System.out.println(solution_771.numJewelsInStones(j, s));
        System.out.println(solution_771.numJewelsInStones(j2, s2));
    }
}

class Solution_771 {
    public int numJewelsInStones(String jewels, String stones) {
        int s = 0;
        for(int i = 0 ; i < jewels.length() ; i++){
            for(int j = 0 ; j < stones.length() ; j++){
                if (jewels.charAt(i) == stones.charAt(j)){
                    s += 1;
                    //System.out.println(jewels.charAt(i) + " " + stones.charAt(j));
                }
            }
        }
        return s;
    }
}

// https://leetcode.com/problems/jewels-and-stones/submissions/

