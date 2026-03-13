package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import String.findSubString;

public class kFrequentElement {
    public static void main(String args[])
    {
        int[] arr = {1,1,1,2,2,3};
        findMostFrequent(arr,2);
    }

    static void findMostFrequent(int[] arr,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i <arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(k > 0){
        list.add(findLargestOccurance(map));
        map.remove(findLargestOccurance(map));
        k--;
        }
        int[] narr = new int[list.size()];
        for(int i = 0;i < narr.length;i++)
        {
            narr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(narr));
        
    }

    static int findLargestOccurance(HashMap<Integer,Integer> map)
    {
        int largest = 0;
        int maxOccurance = 0;
        for(int key : map.keySet())
        {
            if(largest< map.get(key)){
                maxOccurance = key;
                largest = map.get(key);
            }
        }
        return maxOccurance;
    }
}
