package Recursion;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 3 };
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i <= 0; i++) {
        // list.add(i, 1);
        // }
        // System.out.println(list);
        System.out.println(permute(nums));

    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findPermutation(nums, new ArrayList<>(), result, 0);
        return result;
    }

    static void findPermutation(int[] arr, List<Integer> list, List<List<Integer>> result, int index) {
        if (index == arr.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i <= index; i++) {
            list.add(i, arr[index]);
            findPermutation(arr, list, result, index + 1);
            list.remove(i);
        }

    }
}
