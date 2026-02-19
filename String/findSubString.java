package String;

import java.util.HashSet;

public class findSubString {
    public static void main(String[] args) {
        String s = "pwwkew";
        int maxcount = 0;
        HashSet<Character> set = new HashSet<>();
        int count = 1;
       for(int i = 0;i < s.length()-1;i++)
       {
        if(s.charAt(i) != s.charAt(i+1))
        {
            
            set.add(s.charAt(i));
            count = count+1;
            
        }

        if(s.charAt(i) == s.charAt(i+1))
        {
            set.clear();
            count = 1;
        }
        System.out.println(set);
        System.out.println(count+" "+maxcount);
        maxcount = Math.max(maxcount, count);
       }

       System.out.println(set);
       System.out.println(count);
    }
}
