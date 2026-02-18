package Array;


public class checksorted {
    public static void main(String args[])
    {
        int[] arr = {3,4,1,2};
        System.out.println(checksort(arr));
    }

    static boolean checksort(int[] arr)
    {
         int count = 0;
       for(int i = 1;i < arr.length;i++)
       {
        if(arr[i] < arr[i-1])
        {
            count++;
        }
       }
       if(arr[0] < arr[arr.length- 1])
       {
        count++;
       }
       if(count <= 1)
       {
        return true;
       }
       return false;
    }
}
