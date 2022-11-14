package O1_easy.day_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O30_CellsInARangeOnExcelSheet_2194 {
    public static void main(String[] args) {
        Solution_2194 solution_2194 = new Solution_2194();
        String  s = "K1:L2";
        System.out.println(solution_2194.cellsInRange(s));
    }
}


class Solution_2194 {
    public List<String> cellsInRange(String s) {
        char c1 = s.charAt(0), c2 = s.charAt(3);
        char r1 = s.charAt(1), r2 = s.charAt(4);
        List<String> cells = new ArrayList<>();
        for (char c = c1; c <= c2; ++c) {
            for (char r = r1; r <= r2; ++r) {
                cells.add("" + c + r);
            }
        }
        return cells;
    }
}

// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/

