package Array;

import java.util.Arrays;
import java.util.HashMap;

public class sumEqualsK {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1 };
        subarraySum(arr, 2);
    }

    static void subarraySum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(sum, i);
        }
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            int sub = target - nums[j];
            if (map.containsKey(sub)) {
                System.out.println(count++);
            }
        }
        System.out.println(count);
    }
}
