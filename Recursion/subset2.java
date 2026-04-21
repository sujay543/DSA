package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        System.out.println(helper(nums, new ArrayList<>(), list, 0));
    }

    static List<List<Integer>> helper(int[] nums, List<Integer> list2, List<List<Integer>> list, int index) {
        if (index == nums.length) {
            list.add(new ArrayList<>(list2));
            return list;
        }
        helper(nums, list2, list, index + 1);
        list2.add(nums[index]);
        helper(nums, list2, list, index + 1);
        return list;
    }
}
