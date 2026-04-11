package String;

import java.util.ArrayList;
import java.util.HashSet;

public class longestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "pwwkew";
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
            } else {
                while (set.contains(s.charAt(end))) {
                    set.remove(s.charAt(start));
                    start++;

                }
            }
            System.out.println(set);
        }
    }
}
