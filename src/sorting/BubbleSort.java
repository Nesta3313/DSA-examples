package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    static int[] bubbleSort(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++) { // 1st element will not be compared when
            // every other is sorted so there is always n-1 pass, where n is length of array
            boolean swapped = false;
            for(int j = 0; j < nums.length - i - 1; j++) { //jth index is traversed to n-i-1 because at every pass
                // the largest element is sorted and is in the right place, so no need to compare it
                if(nums[j] > nums[j+1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){// if there is no swap done in a pass then array is sorted
                break;
            }
        }
        return nums;
    }

}
