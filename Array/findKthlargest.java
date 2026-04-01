package Array;

import java.util.*;

public class findKthlargest {
    public static void main(String[] args) {
        String[] arr = { "3", "2", "1", "4" };
        int k = 4;
        findlargest(arr, k);
    }

    static void findlargest(String[] str, int k) {
        long[] arr = new long[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        Arrays.sort(arr);
        String nstr = String.valueOf(arr[arr.length - k]);
        System.out.println(nstr);
    }

}
