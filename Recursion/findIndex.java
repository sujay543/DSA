package Recursion;

import java.util.ArrayList;

public class findIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int target = 4;
        System.out.println(checkIndex1(arr, i, target));
    }

    static ArrayList<Integer> checkIndex(int[] arr, ArrayList<Integer> list, int i, int target) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }

        return checkIndex(arr, list, i + 1, target);
    }

    // implementing without passing list as an argument
    static ArrayList<Integer> checkIndex1(int[] arr, int i, int target) {

        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }

        ArrayList<Integer> belowResult = checkIndex1(arr, i + 1, target);
        list.addAll(belowResult);
        return list;
    }
}
