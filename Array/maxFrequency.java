package Array;

import java.util.Collections;
import java.util.HashMap;

public class maxFrequency {
    public static void main(String args[])
    {
        int[] nums = {1,2,2,3,1,4};
        MaxFrequency(nums);
    }

    public static void MaxFrequency(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        int max = Collections.max(map.values());
        int total = 0;
        for(Integer key : map.keySet())
        {
            if(max == map.get(key))
            {
                total += map.get(key);
            }
        }

        System.out.println(total);
    }
}
