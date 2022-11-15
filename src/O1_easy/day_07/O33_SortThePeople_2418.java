package O1_easy.day_07;

import java.util.Arrays;
import java.util.HashMap;

public class O33_SortThePeople_2418 {
    public static void main(String[] args) {
        Solution_2418 solution_2418 = new Solution_2418();
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(solution_2418.sortPeople(names, heights)));
    }
}


class Solution_2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int j = 0; j < n; j++) {
            names[n - j - 1] = hm.get(heights[j]);
        }
        return names;
    }
}

// https://leetcode.com/problems/sort-the-people/submissions/

