package Array;

import java.util.HashMap;

class minMirrorPairDistance {
    public static void main(String[] args) {
        int[] arr = { 21, 120 };
        System.out.println(find(arr));
    }

    static int find(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                min = Math.min(min, i - map.get(nums[i]));
            }
            int reverseNumber = reverseNum(nums[i]);
            map.put(reverseNumber, i);
        }

        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }

    static int reverseNum(int num) {
        while (num % 10 == 0) {
            num = num / 10;
        }
        int val = 0;
        while (num > 0) {
            int res = num % 10;
            val = val * 10 + res;
            num = num / 10;
        }
        return val;
    }
}