package String;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
        String s = "aab";
        String s1 = "abb";
        printMap(s,s1);
    }

    static void printMap(String s,String s1)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0;i < s.length();i++ )
        {
           char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
            Math.max(i, ch)
        }
        for(int i = 0;i < s1.length();i++ )
        {
           char ch = s1.charAt(i);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        boolean isAnagram = true;
        for(char key:  map1.keySet())
        {
            if(map.containsKey(key))
            {
                if(map.get(key) != map1.get(key))
                {
                    isAnagram = false;
                }
            }else{
                isAnagram = false;
            }
        }
        System.out.println(isAnagram);
    }
}
