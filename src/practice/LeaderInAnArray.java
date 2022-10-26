package practice;

import java.util.Arrays;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0};
        leaderArray(nums);
    }

    static void leaderArray(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            boolean flag = false;

            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] <= nums[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(nums[i]);
            }
        }
    }
}
