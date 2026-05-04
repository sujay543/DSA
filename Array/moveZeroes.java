package Array;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 3, 4, 5 };
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int[] nums) {
        int insertPosition = 0;
        int pointer = 0;
        while (pointer < nums.length) {
            if (nums[pointer] != 0) {
                nums[insertPosition] = nums[pointer];
                insertPosition++;
            }
            pointer++;
        }

        while (insertPosition < nums.length) {
            nums[insertPosition] = 0;
            insertPosition++;
        }
    }
}
