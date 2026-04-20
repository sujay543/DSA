package BinarySearch;

import java.util.Arrays;

public class maxDistance {
    public static void main(String args[]) {

        // nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
        int[] nums1 = { 55, 30, 5, 4, 2 };
        int[] nums2 = { 100, 20, 10, 10, 5 };
        System.out.println(maxDistance(nums1, nums2));

    }

    static int maxDistance(int[] nums1, int[] nums2) {
        int maxDistance = Integer.MIN_VALUE;
        for (int i = 0; i <= nums1.length - 1; i++) {
            int j = 0;
            int length1 = nums2.length - 1;
            while (j <= length1) {
                int mid = j + (length1 - j) / 2;
                System.out.println("innerloop");
                if (i <= mid && nums1[i] <= nums2[mid]) {
                    int sub = j - i;
                    maxDistance = Integer.max(maxDistance, sub);
                    j = mid + 1;
                }

                if (nums1[i] > nums2[mid]) {
                    length1 = mid - 1;
                } else {
                    j = mid + 1;
                }
            }
        }
        // System.out.println(maxDistance + "work");
        return maxDistance;
    }
}
