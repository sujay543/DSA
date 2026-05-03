package Recursion;

import java.util.ArrayList;
import java.util.List;

public class letterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        System.out.println(letterCasePermutation(s));
    }

    static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        helper(s, "", result);
        return result;
    }

    static void helper(String s, String current, List<String> result) {
        if (s.isEmpty()) {
            result.add(current);
            return;
        }
        char ch = s.charAt(0);
        if (Character.isLetter(ch)) {
            helper(s.substring(1), current + Character.toLowerCase(ch), result);
            helper(s.substring(1), current + Character.toUpperCase(ch), result);
        } else {
            helper(s.substring(1), current + ch, result);
        }
    }
}
