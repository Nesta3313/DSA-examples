package practice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3,7,5,6,9,8}; //8

        System.out.println(secondLargestInArray(nums));
    }

    /*Given an array, return index of second
    largest element if it exists, return -1 if not*/

    static int secondLargestInArray(int[] nums) {
        int second = -1;
        int largest = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[largest]) {
                second = largest;
                largest = i;
            }else if(nums[i] != nums[largest]) {
                if(second == -1 || nums[i] > nums[second]) {
                    second = i;
                }
            }
        }

        return second;
    }
}
