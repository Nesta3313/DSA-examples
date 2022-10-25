package practice;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(zerosToEnd(nums)));
    }

    static int[] zerosToEnd(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {
                if (nums[j - 1] == 0) {
                    swap(nums, j-1, j);
                }
            }

        }
        return nums;
    }

    static int[] swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return arr;

    }
}
