package Array;

public class rangeSum {
    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(obj.sumRange(0, 2));
    }
}

class NumArray {
    int[] newArr;

    public NumArray(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        this.newArr = arr;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return newArr[right];
        }

        return newArr[right] - newArr[left - 1];
    }
}
