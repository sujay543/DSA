package Recursion;

import java.util.ArrayList;

import java.util.List;

public class subset {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3 };
        System.out.println(subsets(arr));
    }

    static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        helper(arr, new ArrayList<>(), result, 0);
        return result;
    }

    static void helper(int[] arr, List<Integer> current, List<List<Integer>> result, int i) {
        if (i == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        int elemnt = arr[i];
        current.add(elemnt);
        helper(arr, current, result, i + 1);
        current.remove(current.size() - 1);
        helper(arr, current, result, i + 1);
    }
}
