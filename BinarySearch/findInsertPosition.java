package BinarySearch;

public class findInsertPosition {
    public static void main(String args[]) {
        int[] num = { 10, 20, 30, 49 };
        System.out.println(searchInsert(num, 35));

    }

    static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
