package BinarySearch;

import java.util.Arrays;

public class firstandlastPosition {
    public static void main(String args[]) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(search(nums, target)));
    }

    public static int[] search(int[] arr, int target) {
        return new int[] { searchfirstPosition(arr, target), searchLastPosition(arr, target) };

    }

    static int searchfirstPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                if (arr[mid] == target) {
                    ans = mid; // store answer
                }
                end = mid - 1; // move left
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int searchLastPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
