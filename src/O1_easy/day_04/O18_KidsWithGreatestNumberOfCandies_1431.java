package O1_easy.day_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O18_KidsWithGreatestNumberOfCandies_1431 {
    public static void main(String[] args) {
        Solution_1431 solution_1431 = new Solution_1431();
        int[] arr = {2, 3, 5, 1, 3};
        int[] arr2 = {4, 2, 1, 1, 2};
        int[] arr3 = {12, 1, 12};
        System.out.println(solution_1431.kidsWithCandies(arr, 3));
        System.out.println(solution_1431.kidsWithCandies(arr2, 1));
        System.out.println(solution_1431.kidsWithCandies(arr3, 10));
    }
}

class Solution_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            boolean b = false;
            for (int j = 0; j < candies.length; j++) {
                if (i != j && candies[i] + extraCandies < candies[j]) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            result.add(b);
        }
        return result;
    }
}

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max = Arrays.stream(candies).max().getAsInt();
//        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max).collect(Collectors.toList());
//    }
//}
//
//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> ans = new ArrayList<>(candies.length);
//        int max = 0;
//        for (int candy : candies) {
//            max = Math.max(candy, max);
//        }
//        for (int candy : candies) {
//            ans.add(candy + extraCandies >= max);
//        }
//        return ans;
//    }
//}
//
//class Solution {
//    public List<Boolean> kidsWithCandies(int[] cs, int e) {
//        int max = 0;
//        List<Boolean> res = new ArrayList<>();
//        for (int n : cs) max = Math.max(n, max);
//        for (int n : cs) res.add(n + e >= max);
//        return res;
//    }
//}








