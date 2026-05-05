package Array;

public class missingNumber {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 0 };

        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int actualSum = 0;
        for (int element : arr) {
            actualSum += element;
        }

        int expectedSum = 0;
        for (int i = 1; i <= arr.length; i++) {
            expectedSum += i;
        }

        return expectedSum - actualSum;
    }
}
