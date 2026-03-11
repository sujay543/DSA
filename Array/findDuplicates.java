package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class findDuplicates {
    public static void main(String args[])
    {
        int[]  nums = {4,3,2,7,8,2,3,1};
        duplicatefind(nums);
    }

    static void duplicatefind(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }else{
                list.add(arr[i]);
            }
        }

        // ArrayList<Integer> list = new ArrayList<>();
        // int occurance = 2;
        // for(int key : map.keySet())
        // {
        //     if(map.get(key) == occurance)
        //     {
        //         list.add(key);
        //     }
        // }
        System.out.println(list);
    }
}
