package Array;

import java.util.Arrays;
import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4};
        int[] arr2 = {2,2,3};
        System.out.println(Arrays.toString(foundIntersect(arr1, arr2)));
    }

    static int[] foundIntersect(int[] arr1,int[] arr2)
    { HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> resultSet = new HashSet<>();

    for (int num : arr1) {
        set1.add(num);
    }

    for (int num : arr2) {
        if (set1.contains(num)) {
            resultSet.add(num); // avoids duplicates directly
        }
    }

    int[] result = new int[resultSet.size()];
    int i = 0;

    for (int num : resultSet) {
        result[i++] = num;
    }

    return result;
    }
}
