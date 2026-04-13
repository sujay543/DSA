package BinarySearch;

public class findMin {
    public static void main(String args[]) {
        int[] arr = { 4, 5, 6, 7, 1, 2, 3 };
        findMin(arr);
    }

    static void findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[start] < nums[mid]) {
                end = mid + 1;
            } else {
                start = mid - 1;
            }

        }

        System.out.println(nums[start]);
    }
}
