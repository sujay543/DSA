package Recursion;

public class findElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5 };
        int element = 3;
        int start = 0;
        System.out.println(searchElement(arr, element, start));
    }

    static boolean searchElement(int[] arr, int target, int start) {
        if (start >= arr.length) {
            return false;
        }
        if (arr[start] == target) {
            return true;
        }
        return searchElement(arr, target, start + 1);
    }
}
