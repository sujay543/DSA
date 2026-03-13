package Array;

import java.util.Arrays;
import java.util.HashMap;

public class sumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(nums[0],0);
        for(int i = 1;i<nums.length;i++)
        {
           nums[i] = nums[i]+nums[i-1];
           map.put(i,nums[i]);
        }
        // for(Integer key : map.keySet())
        // {
        //     System.out.println(key+" "+map.get(key));
        // }
        int countSubarray = 0;
        for(int j = 0;j < nums.length;j++)
        {
            if(map.containsKey(nums[j] - k))
            {
                countSubarray++;
            }
        }
        System.out.println(countSubarray);
    }
}
