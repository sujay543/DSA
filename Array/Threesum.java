package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Threesum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        threeSum(arr);
    }

    static void threeSum(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Set<List<Integer>> arr1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        ArrayList<Integer> arr2 = new ArrayList<>();
                        arr2.add(arr[i]);
                        arr2.add(arr[j]);
                        arr2.add(arr[k]);
                        arr1.add(arr2);
                    }
                }
            }

        }
        System.out.println(arr1);
    }

}
