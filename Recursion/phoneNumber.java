package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class phoneNumber {
    public static void main(String[] args) {
        letterCombinations("23");
    }

    static void letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> result = new ArrayList<>();
        helper(digits.toCharArray(), result, map, "", 0);
        System.out.println(result);
    }

    static void helper(char[] s, List<String> result, HashMap<Character, String> map, String current, int index) {
        if (index == s.length) {
            result.add(current);
            return;
        }
        String value = map.get(s[index]);
        for (int i = 0; i < value.length(); i++) {
            helper(s, result, map, current + value.charAt(i), index + 1);
        }
    }
}
