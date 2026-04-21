package Array;

import java.util.*;

public class removeduplicates1 {
    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

}
