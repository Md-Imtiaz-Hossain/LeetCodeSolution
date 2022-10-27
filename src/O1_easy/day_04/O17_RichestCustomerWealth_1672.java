package O1_easy.day_04;

import java.util.Arrays;

public class O17_RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        Solution_1672 solution_1672 = new Solution_1672();
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        int[][] arr2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] arr3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(solution_1672.maximumWealth(arr));
        System.out.println(solution_1672.maximumWealth(arr2));
        System.out.println(solution_1672.maximumWealth(arr3));
    }
}

class Solution_1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int a = wealth(accounts[i]);
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public int wealth(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

// https://leetcode.com/problems/richest-customer-wealth/submissions/

//class Solution {
//    public int maximumWealth(int[][] accounts) {
//        int temp = 0;
//        for (int i = 0; i < accounts.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < accounts[i].length; j++) {
//                sum = sum + accounts[i][j];
//            }
//            if (sum > temp) {
//                temp = sum;
//            }
//        }
//        return temp;
//    }
//}
//
//
//class Solution {
//    public int maximumWealth(int[][] accounts) {
//        return Arrays.stream(accounts)
//                .mapToInt(i -> Arrays.stream(i).sum())
//                .max()
//                .getAsInt();
//    }
//}
//
//class Solution {
//    public int maximumWealth(int[][] accounts) {
//        var maxWealth = 0;
//        for (var customer : accounts) {
//            maxWealth = Math.max(maxWealth, Arrays.stream(customer).sum());
//        }
//        return maxWealth;
//    }
//}
