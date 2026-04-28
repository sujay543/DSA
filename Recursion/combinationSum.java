package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(combinationSum(arr, target));
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, new ArrayList(), result, 0);
        return result;
    }

    static void helper(int[] candidates, int target, List<Integer> newList, List<List<Integer>> result, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(newList));
            return;
        }

        if (index >= candidates.length || target < 0) {
            return;
        }
        newList.add(candidates[index]);
        helper(candidates, target - candidates[index], newList, result, index);
        newList.remove(newList.size() - 1);
        helper(candidates, target, newList, result, index + 1);
        return;

    }
}
