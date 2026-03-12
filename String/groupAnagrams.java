package String;

import java.util.ArrayList;
import java.util.Arrays;

public class groupAnagrams {
    public static void main(String[] args) {
      String strs[] =  {"eat","tea","tan","ate","nat","bat"};
        findAnagrams(strs);
    }

    static void findAnagrams(String[] strs)
    {
        ArrayList<ArrayList<String>> upperList = new ArrayList<>();
        for(int i = 0;i < strs.length;i++)
        {
            ArrayList<String> list = new ArrayList<>();
            for(int j = i;j < strs.length;j++)
            {
                if(isAnagram(strs[i], strs[j]) && checkPresent(upperList, strs[j]))
                {
                    list.add(strs[j]);
                }
            }
            upperList.add(list);
        }

       upperList.removeIf(list -> list.isEmpty());
       System.out.println(upperList);

    }

    static boolean checkPresent( ArrayList<ArrayList<String>> upperlist, String taget)
    {
        for(ArrayList<String> str : upperlist)
        {
            if(str.contains(taget))
            {
                return false;
            }
        }
        return true;
    }


    static boolean isAnagram(String s1,String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
