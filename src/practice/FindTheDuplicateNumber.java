package practice;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findDuplicate(nums));

    }

    static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) {
                return nums[i];
            }
        }

        return -1;
    }
}
