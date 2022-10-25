package practice;



public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {4,3,1};
        System.out.println(sortedArr(nums));
    }

    static boolean sortedArr(int[] nums) {
        if(nums.length == 0) {
            return false;
        }
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                return false;
            }
        }
        return true;
    }
}
