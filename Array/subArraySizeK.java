package Array;

public class subArraySizeK {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }

    static int numOfSubarrays(int[] arr, int k, int threshold) {
        int countSubArray = 0;
        int windowsize = 0;
        for (int i = 0; i < k; i++) {
            windowsize += arr[i];
        }

        if (windowsize / k >= threshold) {
            countSubArray++;
        }

        for (int i = k; i < arr.length; i++) {
            windowsize = windowsize - arr[i - k] + arr[i];
            if (windowsize / k >= threshold) {
                countSubArray++;
            }

        }

        return countSubArray;
    }
}
