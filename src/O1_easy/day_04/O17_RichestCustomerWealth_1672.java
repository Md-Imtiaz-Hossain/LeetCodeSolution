package O1_easy.day_04;

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
