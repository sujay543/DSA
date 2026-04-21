package Array;

import java.util.Arrays;

public class removeDuplicates2 {
    public static void main(String args[]) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };
        removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicate(int[] arr) {
        int pointer = 0;
        int end = arr.length - 1;

        while (pointer < end) {
            if (arr[pointer] == arr[pointer + 1]) {
                leftShif(arr, pointer);
                end--;
            } else {
                pointer++;
            }
        }
        return end + 1;
    }

    static void leftShif(int[] arr, int start) {
        while (start < arr.length - 1) {
            arr[start] = arr[start + 1];
            start++;
        }
    }
}
