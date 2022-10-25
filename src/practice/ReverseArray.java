package practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,9};
        System.out.println(Arrays.toString(reverse(nums)));

    }

    /*
    * Given an array of length n, reverse the array
    *
    * */

    static int[] reverse(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
        return nums;

    }

    static int[] swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        return nums;
    }
}
