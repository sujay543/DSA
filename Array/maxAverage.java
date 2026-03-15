package Array;

public class maxAverage {
    public static void main(String args[]) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        System.out.println(maxAverage(nums, 4));
    }

    static double maxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }
        double windowSize = 0;
        for (int i = 0; i < k; i++) {
            windowSize += nums[i];
        }

        double maxAverage = windowSize / k;
        for (int i = k; i < nums.length; i++) {
            windowSize = windowSize + nums[i] - nums[i - k];
            maxAverage = Math.max((windowSize / k), maxAverage);
        }
        return maxAverage;
    }
}
