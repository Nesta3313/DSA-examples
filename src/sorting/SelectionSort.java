package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(nums)));

    }

    static int[] selectionSort(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = getMax(nums, 0, last);
            swap(nums, last, max);

        }
        return nums;
    }

    static void swap(int[] nums, int last, int max) {
        int temp = nums[last];
        nums[last] = nums[max];
        nums[max] = temp;
    }

    static int getMax(int[] nums, int start, int last) {
        int large = 0;
        start = 0;
        for(int i = start + 1; i <= last; i++) {
            if(nums[start] < nums[i]) {
                large = nums[i];
            }
        }
        return large;
    }

}
