package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination2 {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        System.out.println(combinationSum2(arr, 8));
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    static void helper(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int index) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            current.add(candidates[i]);
            helper(result, current, candidates, target - candidates[i], i + 1);
            current.remove(current.size() - 1);
        }
    }
}
