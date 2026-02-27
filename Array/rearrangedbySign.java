package Array;

import java.util.Arrays;

public class rearrangedbySign {
    public static void main(String[] args) {
        int[] arr = {-1,1};
        System.out.println(Arrays.toString(arrange(arr)));
    }

    static int[] arrange(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];

        int posIndex = 0;
        int negIndex = 1;
        for(int i = 0; i < arr.length;i++)
        {
            if(arr[i] < 0)
            {
                ans[negIndex] = arr[i];
                negIndex += 2;
            }else
            {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }
}
