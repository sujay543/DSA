package String;

import java.util.HashSet;

public class findSubString {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
         int start = 0;
         int end = 0;
         int n = s.length() - 1;
         int maxSize = 0;
         while(end <= n)
         {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                end++;
            }else{
            
            while(set.contains(s.charAt(end)))
            {
                set.remove(s.charAt(start));
                     start++;
            }
       

            }
            int windowSize = end - start + 1;
            maxSize = Math.max(maxSize, windowSize);
         }
         return maxSize;
    }
}
