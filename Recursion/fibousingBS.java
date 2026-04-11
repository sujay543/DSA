package Recursion;

import Array.secondLargest;

public class fibousingBS {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 10, 12, 13 };
        int start = 0;
        int end = arr.length - 1;

        int index = search(arr, start, end, 0);
        System.out.println(index);
    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return search(arr, mid + 1, end, target);
        }
        return search(arr, start, mid - 1, target);
    }

}
