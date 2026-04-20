package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static void main(String[] args) {
        int[] nums = { 4, 4, 4, 1, 4 };
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        System.out.println(helper(nums, new ArrayList<>(), list, 0));
    }

    static List<List<Integer>> helper(int[] nums, List<Integer> list2, List<List<Integer>> list, int index) {

        list.add(list2);
        for (int i = index; i < nums.length; i++) {
            list2.add(nums[i]);
            helper(nums, list2, list, index + 1);
            list2.remove(list2.size() - 1);
            helper(nums, list2, list, index + 1);
        }

        return list;
    }
}
