package Recursion;

public class binarySearch {
    public static void main(String args[]) {
        int[] arr = { 5, 6, 7, 8, 1, 2, 3 };
        int start = 0;
        int end = arr.length - 1;
        int target = 8;
        System.out.println(search(arr, start, end, target));
    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return search(arr, start, end, target);
    }
}
