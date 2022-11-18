package algo;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {500, 10, 30, 20, 100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 20;
        int first = 0;
        int last = arr.length - 1;
        binarySearch(arr, first, last, target);
    }


    public static void binarySearch(int[] arr, int first, int last, int target) {

        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < target) {
                first = mid + 1;
            } else if (arr[mid] == target) {
                System.out.println("Target found in position- " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Not found");
        }
    }
}
