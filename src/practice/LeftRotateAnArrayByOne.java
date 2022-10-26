package practice;

import java.util.Arrays;


public class LeftRotateAnArrayByOne {
    public static void main(String[] args) {
        int[] nums = {2,3,1,4,5};
        System.out.println(Arrays.toString(leftRotate(nums)));
    }

    static int[] leftRotate(int[] nums) {
        int start = 0;
        int end = 1;

       for(int i = 1; i <= 2; i++) {
           while(end <= nums.length - 1) {
               swap(nums, start, end) ;
               start++;
               end++;
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
