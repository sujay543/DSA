package Recursion;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        helper(arr, 0, arr.length - 1);
    }

    static void helper(int[] arr, int index, int count) {
        if (count == 0) {
            return;
        }
        if (index < count) {
            if (arr[index] > arr[index + 1]) {
                swap(arr, index, index + 1);
            }
            helper(arr, index + 1, count);
        } else {
            helper(arr, 0, count - 1);
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
