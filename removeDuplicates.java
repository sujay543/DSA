import java.util.Arrays;

public class removeDuplicates {
    public static void main(String args[])
    {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        duplicateRemove(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void duplicateRemove(int[] arr)
    {
        int n = arr.length - 1;
        int start = 0;
        int end = start + 1;
        int count = 0;
        while(end <= n)
        {
            if(arr[start]!=arr[end])
            {
                count++;
                arr[count] = arr[end];
            }
            start++;
            end++;
        }
        System.out.println(count);
    }
}
