import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {2,1,4,6,5};
//        System.out.println(Arrays.toString(bubbleSort(nums)));

        int a = 4;
        int b = 90;
        swap(4, 90);
        System.out.println(a);
        System.out.println(b);

    }


    static int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    swap(nums[j], nums[j + 1]);
                }
            }
        }
        return nums;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}