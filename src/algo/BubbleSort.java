package algo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {500, 10, 30, 20, 100};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < (arr.length - i); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    //swap elements
//                    arr[j - 1] = (arr[j - 1] * arr[j]) / (arr[j] = arr[j - 1]);
//                }
//            }
//        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1- i); j++) {
                if (arr[j] > arr[j+1]) {
                    //swap elements
                    arr[j] = (arr[j] * arr[j+1]) / (arr[j+1] = arr[j]);
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
