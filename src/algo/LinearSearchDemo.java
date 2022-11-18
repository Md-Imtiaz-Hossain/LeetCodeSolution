package algo;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {500, 10, 30, 20, 100};
        int target = 200;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                flag = false;
            } else if (arr[i] == target) {
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("Found");
        }else System.out.println("Not Found");

    }
}
