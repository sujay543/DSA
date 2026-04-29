package Recursion;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int k = 2;
        List<List<Integer>> result = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), result, k);
        System.out.println(result);
    }

    static void helper(int[] arr, int index, List<Integer> current, List<List<Integer>> result, int maxlength) {
        if (current.size() == maxlength) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == arr.length) {
            return;
        }
        current.add(arr[index]);
        helper(arr, index + 1, current, result, maxlength);
        current.remove(current.size() - 1);
        helper(arr, index + 1, current, result, maxlength);
    }
}
