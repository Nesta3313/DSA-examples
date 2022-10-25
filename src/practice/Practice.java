package practice;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {2,0,-1,-3,-5};
        System.out.println(binarySearch(nums, -1));

        Arrays.binarySearch(nums, 32);


    }

    static int binarySearch(int[] nums, int k) {
        //given an order agnostic search find the value

        int start = 0;
        int end = nums.length - 1;



        if(nums[nums.length-1] >= nums[0]) {
            //ascending order array
            while(start < end) {
                int mid = start + (end - start)/2;
                if(k > nums[mid]) {
                    start = mid + 1;
                }else if(k < nums[mid]) {
                    end = mid -1;
                }else if(k == nums[mid]) {
                    return mid;
                }
            }

        } else if (nums[nums.length - 1] <= nums[0]) {
            while (start < end) {
                int mid = start + (end - start)/2;
                if (k > nums[mid]) {
                    end = mid - 1;
                }else if (k < nums[mid]) {
                    start = mid + 1;
                }else if (k == nums[mid]) {
                    return mid;
                }
            }

        }

        return -1; //value cannot be found
    }



}

