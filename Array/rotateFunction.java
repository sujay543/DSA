package Array;

import java.util.*;

public class rotateFunction {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 6 };
        maxRotateFufunction(nums);
    }

    static void maxRotateFufunction(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int maxSum = 0;
        while (length > 0) {
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i] * i;
            }
            maxSum = Math.max(maxSum, sum);
            sum = 0;
            rightShift(nums);
            length--;
        }
        System.out.println(maxSum);
    }

    static void rightShift(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
}
