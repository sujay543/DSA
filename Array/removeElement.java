package Array;

import java.util.*;

public class removeElement {
    public static void main(String[] args) {
        int[] num = { 1, 1, 2, 3, 4 };
        removeElement(num, 1);
        System.out.println(Arrays.toString(num));
    }

    static int removeElement(int[] nums, int val) {
        int start = 0;
        int end = 0;
        while (end <= nums.length - 1) {
            if (nums[end] != val) {
                nums[start] = nums[end];
                start++;
            }
            end++;
        }
        return start;
    }
}
