package Recursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String args[]) {
        int[] arr = { 4, 3, 2, 8, 1 };
        int lastIndex = arr.length - 1;
        sort(arr, lastIndex);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int lastIndex) {
        if (lastIndex == 0) {
            return;
        }

        int max = getMax(arr, lastIndex);
        swap(arr, max, lastIndex);

        sort(arr, lastIndex - 1);
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getMax(int[] arr, int lastIndex) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

}
