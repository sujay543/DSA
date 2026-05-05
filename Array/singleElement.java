package Array;

public class singleElement {
    public static void main(String args[]) {
        int[] nums = { 1, 1, 2, 3, 3, 0, 0 };
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        int result = 0;
        for (int element : nums) {
            result ^= element;
        }
        return result;
    }
}
