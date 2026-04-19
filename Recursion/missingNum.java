package Recursion;

import java.util.HashSet;

public class missingNum {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 5 };
        System.out.println(missingNum(arr));
    }

    static int missingNum(int arr[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 1; i < arr[arr.length - 1]; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
